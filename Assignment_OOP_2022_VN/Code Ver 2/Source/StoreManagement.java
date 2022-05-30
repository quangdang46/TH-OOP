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

    //get index
    public int getIndex(ArrayList<String> list_id,String tmp){
        for(int i=0;i<list_id.size();i++){
            if(list_id.get(i).equals(tmp)){
                return i;
            }
        }
        return -1;
    }

    public void Sort_new(ArrayList<SeasonalStaff> list_staff,ArrayList<Double> list_salary){
        for(int i=0;i<list_staff.size()-1;i++){
            for(int j=i+1;j<list_staff.size();j++){
                if(list_salary.get(i)<list_salary.get(j)){
                    double tmp=list_salary.get(i);
                    list_salary.set(i,list_salary.get(j));
                    list_salary.set(j,tmp);
        
                    SeasonalStaff tmp1=list_staff.get(i);
                    list_staff.set(i,list_staff.get(j));
                    list_staff.set(j,tmp1);
                }
            }
        }
    }

    // requirement 2
    public ArrayList<SeasonalStaff> getTopFiveSeasonalStaffsHighSalary() {
        //code here and modify the return value
        ArrayList<String> list_id = new ArrayList<String>();
        ArrayList<Integer>  list_time= new ArrayList<Integer>();

        
        for(String tmp:workingTime){
            String[] information = tmp.split(",");
            list_id.add(information[0]);
            list_time.add(Integer.parseInt(information[1]));
        }

        ArrayList<SeasonalStaff> list_staff=new ArrayList<SeasonalStaff>();
        ArrayList<Double> list_salary=new ArrayList<Double>();
        for(Staff staff:staffs){
            if(staff instanceof SeasonalStaff){
                list_staff.add((SeasonalStaff)staff);
                list_salary.add(staff.paySalary(list_time.get(getIndex(list_id,staff.getsID()))));
            }
        }

        Sort_new(list_staff,list_salary);
        ArrayList<SeasonalStaff> result = new ArrayList<SeasonalStaff>();
        for(int i=0;i<5;i++){
            result.add(list_staff.get(i));
        }
        return result;
    }

    // requirement 3
    public ArrayList<FullTimeStaff> getFullTimeStaffsHaveSalaryGreaterThan(int lowerBound) {
        //code here and modify the return value
        ArrayList<String> list_id = new ArrayList<String>();
        ArrayList<Integer>  list_time= new ArrayList<Integer>();
        for(String tmp:workingTime){
            String[] information = tmp.split(",");
            list_id.add(information[0]);
            list_time.add(Integer.parseInt(information[1]));
        }

        ArrayList<FullTimeStaff> list_staff=new ArrayList<FullTimeStaff>();
        ArrayList<Double> list_salary=new ArrayList<Double>();
        for(Staff staff:staffs){
            if(staff instanceof FullTimeStaff){
                list_staff.add((FullTimeStaff)staff);
                list_salary.add(staff.paySalary(list_time.get(getIndex(list_id,staff.getsID()))));
            }
        }

        ArrayList<FullTimeStaff> result = new ArrayList<FullTimeStaff>();
        for(int i=0;i<list_salary.size();i++){
            if(list_salary.get(i)>lowerBound){
                result.add(list_staff.get(i));
            }
        }
        return result;
    }

    //get
    public int getQuarter(String date) {
    
        int month=Integer.parseInt(date.split("/")[1]);
        if(month==1 || month==2 || month==3){
            return 1;
        }else if(month==4 || month==5 || month==6){
            return 2;
        }else if(month==7 || month==8 || month==9){
            return 3;
        }
        return 4;
    }
    public void add_drink(ArrayList<String> names,ArrayList<Integer> numbers){
        for(Drink drink:drinks){
            names.add(drink.getdName());
            numbers.add(drink.getPrice());
        }
    }
    public double sum_money(ArrayList<String> id){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //
        add_drink(names,numbers);
        //
        double total = 0;
        for(String tmp:id){
            for(InvoiceDetails invoice: invoiceDetails){
                if(tmp.equals(invoice.getInvoiceID())){
                    total +=invoice.getAmount()*numbers.get(names.indexOf(invoice.getDName()));
                }
            }
        }
        return total;
    }
    // requirement 4
    public double totalInQuarter(int quarter) {
        // code here
        ArrayList<String> list = new ArrayList<String>();
        for(Invoice invoice : invoices){
            if(getQuarter(invoice.getDate())== quarter){
                list.add(invoice.getInvoiceID());
            }
        }
        return sum_money(list);
    }

    public boolean check_month(String date,int month) {
        return Integer.parseInt(date.split("/")[1])== month;
    }

    // requirement 5
    public Staff getStaffHighestBillInMonth(int month) {
        //code here
        ArrayList<Double> tmp=new ArrayList<Double>();
        for(Staff staff : this.staffs){
            ArrayList<String> list_id = new ArrayList<String>();
            double total = 0;
            for(Invoice invoice :invoices){
                if(staff.getsID().equals(invoice.getStaffID()) && check_month(invoice.getDate(),month)){
                    list_id.add(invoice.getInvoiceID());
                }
            }
            tmp.add(sum_money(list_id));
        }
        return staffs.get(tmp.indexOf(Collections.max(tmp)));
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