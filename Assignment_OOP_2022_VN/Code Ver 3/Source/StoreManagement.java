import java.io.*;
import java.util.*;

public class StoreManagement {
    private ArrayList<Staff> staffs;
    private ArrayList<String> workingTime;
    private ArrayList<Invoice> invoices;
    private ArrayList<InvoiceDetails> invoiceDetails;
    private ArrayList<Drink> drinks;

    public StoreManagement(String staffPath, String workingTimePath, String invoicesPath, String detailsPath, String drinksPath) {
        this.staffs = loadStaffs(staffPath);
        this.workingTime = loadFile(workingTimePath);
        this.invoices = loadInvoices(invoicesPath);
        this.invoiceDetails = loadInvoicesDetails(detailsPath);
        this.drinks = loadDrinks(drinksPath);
    }

    public ArrayList<Staff> getStaffs() {
        return this.staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs){
        this.staffs = staffs;
    }
    
    public ArrayList<Drink> loadDrinks(String filePath) {
        ArrayList<Drink> drinksResult = new ArrayList<Drink>();
        ArrayList<String> drinks = loadFile(filePath);

        for (String drink : drinks) {
            String[] information = drink.split(",");
            drinksResult.add(new Drink(information[0], Integer.parseInt(information[1])));
        }

        return drinksResult;
    }

    public ArrayList<Invoice> loadInvoices(String filePath) {
        ArrayList<Invoice> invoiceResult = new ArrayList<Invoice>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new Invoice(information[0], information[1], information[2]));
        }

        return invoiceResult;
    }

    public ArrayList<InvoiceDetails> loadInvoicesDetails(String filePath) {
        ArrayList<InvoiceDetails> invoiceResult = new ArrayList<InvoiceDetails>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new InvoiceDetails(information[0], information[1], Integer.parseInt(information[2])));
        }

        return invoiceResult;
    }

    // requirement 1
    public ArrayList<Staff> loadStaffs(String filePath) {
        //code here and modify the return value
        ArrayList<Staff> staffsResult = new ArrayList<Staff>();
        ArrayList<String> staffs = loadFile(filePath);
        for(String staff : staffs) {
            String[] information = staff.split(",");
            if(information.length == 3) {
                staffsResult.add(new SeasonalStaff(information[0], information[1], Integer.parseInt(information[2])));
            }else if(information.length == 4) {
                staffsResult.add(new FullTimeStaff(information[0], information[1], Integer.parseInt(information[2]), Double.parseDouble(information[3])));
            }else if(information.length == 5) {
                staffsResult.add(new Manager(information[0], information[1], Integer.parseInt(information[2]), Double.parseDouble(information[3]), Integer.parseInt(information[4])));
            }
        }
        return staffsResult;
    }

    public HashMap<String,Integer> getTimeWork() {
        HashMap<String,Integer> time = new HashMap<String,Integer>();
        for(String workingTime : this.workingTime) {
            String[] information = workingTime.split(",");
            time.put(information[0], Integer.parseInt(information[1]));
        }
        return time;
    }
    public void Sort_new(ArrayList<SeasonalStaff> tmp1,ArrayList<Double> tmp2){
        //Selection Sort
        for(int i = 0; i < tmp1.size() - 1; i++) {
            int min = i;
            for(int j = i + 1; j < tmp1.size(); j++) {
                if(tmp2.get(j) > tmp2.get(min)) {
                    min = j;
                }
            }
            if(min != i) {
                double tmp = tmp2.get(i);
                tmp2.set(i, tmp2.get(min));
                tmp2.set(min, tmp);
                SeasonalStaff tmp1_1 = tmp1.get(i);
                tmp1.set(i, tmp1.get(min));
                tmp1.set(min, tmp1_1);
            }
        }

    }        



    // requirement 2
    public ArrayList<SeasonalStaff> getTopFiveSeasonalStaffsHighSalary() {
        //code here and modify the return value
        HashMap<String,Integer> time = getTimeWork();
        ArrayList<SeasonalStaff> seasonalStaffs = new ArrayList<SeasonalStaff>();
        ArrayList<Double> salary = new ArrayList<Double>();
        for(Staff staff :staffs) {
            if(staff instanceof SeasonalStaff) {
                seasonalStaffs.add((SeasonalStaff)staff);
                salary.add(staff.paySalary(time.get(staff.getsID())));
            }
        }
        Sort_new(seasonalStaffs,salary);
        ArrayList<SeasonalStaff> result = new ArrayList<SeasonalStaff>();
        for(int i = 0; i < 5; i++) {
            result.add(seasonalStaffs.get(i));
        }
        return result;
    }

    // requirement 3
    public ArrayList<FullTimeStaff> getFullTimeStaffsHaveSalaryGreaterThan(int lowerBound) {
        //code here and modify the return value
        HashMap<String,Integer> time = getTimeWork();
        ArrayList<FullTimeStaff> fullTimeStaffs = new ArrayList<FullTimeStaff>();
        for(Staff staff :staffs) {
            if(staff instanceof FullTimeStaff) {
                if(staff.paySalary(time.get(staff.getsID())) > lowerBound) {
                    fullTimeStaffs.add((FullTimeStaff)staff);
                }
            }
        }
        return fullTimeStaffs;
    }

    public int getQuarter(String date) {
        int mount =Integer.parseInt(date.split("/")[1]);
        switch(mount) {
            case 1:
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
            case 6:
                return 2;
            case 7:
            case 8:
            case 9:
                return 3;
        }
        return 4;
    }
    public double total_cnt(String id){
        double total = 0;
        for(InvoiceDetails invoiceDetails : invoiceDetails) {
            if(invoiceDetails.getInvoiceID().equals(id)) {
                for(Drink drink : drinks) {
                    if(drink.getdName().equals(invoiceDetails.getDName())) {
                        total += drink.getPrice() * invoiceDetails.getAmount();
                    }
                }

            }
        }
        return total;
    }
    // requirement 4
    public double totalInQuarter(int quarter) {
        double total = 0;
        // code here
        for(Invoice invoice : invoices) {
            if(getQuarter(invoice.getDate()) == quarter) {
                total += total_cnt(invoice.getInvoiceID());
            }
        }
        return total;
    }
    public boolean checkMonth(String date,int month) {
        return Integer.parseInt(date.split("/")[1]) == month;
    }
    // requirement 5
    public Staff getStaffHighestBillInMonth(int month) {
        Staff maxStaff = null;
        ArrayList<String> id = new ArrayList<String>();
        ArrayList<Double> total_tmp = new ArrayList<Double>();
        ArrayList<Staff> staffs_result = new ArrayList<Staff>();
        for(Staff staff : staffs) {
            for(Invoice invoice : invoices) {
                if(staff.getsID().equals(invoice.getStaffID()) && checkMonth(invoice.getDate(),month)) {
                    if(!id.contains(staff.getsID())) {
                        id.add(staff.getsID());
                        total_tmp.add(total_cnt(invoice.getInvoiceID()));
                        staffs_result.add(staff);
                    }else {
                        int index = id.indexOf(staff.getsID());
                        total_tmp.set(index, total_tmp.get(index) + total_cnt(invoice.getInvoiceID()));
                    }
                }
            }
        }
        maxStaff = staffs_result.get(total_tmp.indexOf(Collections.max(total_tmp)));
        return maxStaff;
    }

    // load file as list
    public static ArrayList<String> loadFile(String filePath) {
        String data = "";
        ArrayList<String> list = new ArrayList<String>();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader fReader = new BufferedReader(reader);

            while ((data = fReader.readLine()) != null) {
                list.add(data);
            }

            fReader.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Cannot load file");
        }
        return list;
    }

    public void displayStaffs() {
        for (Staff staff : this.staffs) {
            System.out.println(staff);
        }
    }

    public <E> boolean writeFile(String path, ArrayList<E> list) {
        try {
            FileWriter writer = new FileWriter(path);
            for (E tmp : list) {
                writer.write(tmp.toString());
                writer.write("\r\n");
            }

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }

    public <E> boolean writeFile(String path, E object) {
        try {
            FileWriter writer = new FileWriter(path);

            writer.write(object.toString());
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }
}