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
            } else if(information.length == 4) {
                staffsResult.add(new FullTimeStaff(information[0], information[1], Integer.parseInt(information[2]), Double.parseDouble(information[3])));
            }else if(information.length == 5) {
                staffsResult.add(new Manager(information[0], information[1], Integer.parseInt(information[2]), Double.parseDouble(information[3]), Integer.parseInt(information[4])));
            }
        }
        return staffsResult;
    }

    // requirement 2
    public ArrayList<SeasonalStaff> getTopFiveSeasonalStaffsHighSalary() {
        //code here and modify the return value
        ArrayList<SeasonalStaff> seasonalStaffs = new ArrayList<SeasonalStaff>();
        for(Staff staff : this.staffs) {
            if(staff instanceof SeasonalStaff) {
                seasonalStaffs.add((SeasonalStaff)staff);
            }
        }
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String time:workingTime) {
            String[] information = time.split(",");
            map.put(information[0],Integer.parseInt(information[1]));
        }
        Collections.sort(seasonalStaffs, new Comparator<SeasonalStaff>() {
            @Override
            public int compare(SeasonalStaff o1, SeasonalStaff o2) {
                return (int)(o2.paySalary(
                    map.get(o2.getsID())
                ) - o1.paySalary(
                    map.get(o1.getsID())
                ));
            }
        });
        ArrayList<SeasonalStaff> result = new ArrayList<SeasonalStaff>();
        for(int i = 0; i < 5; i++) {
            result.add(seasonalStaffs.get(i));
        }
        return result;
    }

    // requirement 3
    public ArrayList<FullTimeStaff> getFullTimeStaffsHaveSalaryGreaterThan(int lowerBound) {
        //code here and modify the return value
        ArrayList<FullTimeStaff> fullTimeStaffs = new ArrayList<FullTimeStaff>();
        for(Staff staff : this.staffs) {
            if(staff instanceof FullTimeStaff){
                fullTimeStaffs.add((FullTimeStaff)staff);
            }
        }
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String time:workingTime) {
            String[] information = time.split(",");
            map.put(information[0],Integer.parseInt(information[1]));
        }

        ArrayList<FullTimeStaff> result = new ArrayList<FullTimeStaff>();
        for(FullTimeStaff staff : fullTimeStaffs) {
            if(staff.paySalary(map.get(staff.getsID())) > lowerBound) {
                result.add(staff);
            }
        }
        return result;
    }
    public double Solve(ArrayList<String> invoiceId){
        double result = 0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(InvoiceDetails invoice : this.invoiceDetails) {
            if(invoiceId.contains(invoice.getInvoiceID())) {
                if(map.containsKey(invoice.getDName())) {
                    map.put(invoice.getDName(), map.get(invoice.getDName()) + invoice.getAmount());
                } else {
                    map.put(invoice.getDName(), invoice.getAmount());
                }
            }
        }

        for(Drink drink : this.drinks) {
            if(map.containsKey(drink.getdName())) {
                result +=drink.getPrice() * map.get(drink.getdName());
            }
        }
        
        return result;
    }

    // requirement 4
    public ArrayList<Integer> ArrQuarter(int quarter) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        switch (quarter) {
            case 1:case 2:case 3:
                result.addAll(Arrays.asList(1, 2, 3));
                break;
            case 4:case 5:case 6:
                result.addAll(Arrays.asList(4, 5, 6));
                break;
            case 7:case 8:case 9:
                result.addAll(Arrays.asList(7, 8, 9));
                break;
            case 10:case 11:case 12:
                result.addAll(Arrays.asList(10, 11, 12));
                break;
        }
        return result;
    }
    public double totalInQuarter(int quarter) {
        // code here
        ArrayList<Integer> quarters = ArrQuarter(quarter);
        ArrayList<String> invoiceId =new ArrayList<String>();
        for(Invoice invoice : this.invoices) {
            String[] date = invoice.getDate().split("/");
            if(quarters.contains(Integer.parseInt(date[1]))) {
                invoiceId.add(invoice.getInvoiceID());
            }
        }
        return Solve(invoiceId);
    }

    
    // requirement 5
    public boolean check(String str,int month){
        String[] date = str.split("/");
        if(Integer.parseInt(date[1]) == month) {
            return true;
        }
        return false;
    }

    public double total(String id,int month){
        ArrayList<String> invoiceId =new ArrayList<String>();
        for(Invoice invoice : this.invoices) {
            if(invoice.getStaffID().equals(id) && check(invoice.getDate(),month)) {
                invoiceId.add(invoice.getInvoiceID());
            }
        }
        return Solve(invoiceId);
    }
    public Staff getStaffHighestBillInMonth(int month) {
        Staff maxStaff = null;
        HashMap<String,Double> map = new HashMap<String,Double>();
        for(Staff staff : this.staffs) {
            map.put(staff.getsID(), total(staff.getsID(),month));
        }

        double max=(Collections.max(map.values()));
        for(Staff staff : this.staffs) {
            if(map.get(staff.getsID()) == max) {
                maxStaff = staff;
            }
        }

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