import java.util.Scanner;

public class Patient {
    protected String name;
    protected int year;
    private String diagnoz;
    private static boolean firstTime;
    protected String data;

    public String printIn(){
        Scanner fio =new Scanner(System.in);
        System.out.println("Введите ФИО пациента");
        name= fio.nextLine();
        Scanner years =new Scanner(System.in);
        System.out.println("Введите возраст пациента");
        year = years.nextInt();
        Scanner diag =new Scanner(System.in);
        System.out.println("Введите диагноз пациента");
        diagnoz = diag.next();
        Scanner firstTime =new Scanner(System.in);
        System.out.println("Первый прием (да\\нет)");
        if(firstTime.nextLine().equals("да")){
            Patient.firstTime = true;
        } else if (firstTime.nextLine().equals("нет")){
            Patient.firstTime = false;
        }
        data = name+"-"+year+"-"+diagnoz;
        return data;
    }
   /** protected void getName (String data){
        String [] patientData = data.split("-");
        String tmp = patientData[0];
        String [] fio = tmp.split(" ");
        name = fio[1];
    }
    protected void getYear (String data){
        String [] patientData = data.split("-");
        String tmp = patientData[1];
        year = Integer.parseInt(tmp);
    }**/

    protected void printOut (String data){
        String [] patientData = data.split("-");
        System.out.println("Пациент: \""+patientData[0]+"\" - Возраст =\""+patientData[1]+"\"");
        System.out.println("Диагноз: "+patientData[2]);
        if (Patient.firstTime){
            System.out.println("Пациент поступил впервые");
        }
    }
    public void sortOut (Patient array []){
        System.out.println("Поиск пациента: введите 1 для поиска по имени, введите 2 для поиска по возрасту");
        Scanner searchType =new Scanner(System.in);
        if(searchType.nextInt()==1){
            this.nameSearch(array);
        }
        if(searchType.nextInt()==2){
            this.yearSearch(array);
        }
    }
    public void yearSearch (Patient array[]){
        System.out.println("Введите возраст пациента: ");
        Scanner searchName =new Scanner(System.in);
        int year = searchName.nextInt();
        for (Patient patient: array) {
            if (patient.year==year){
                System.out.println("Найден пациент: "+ patient.name);
            }
        }
    }
    public void nameSearch (Patient array[]){
        System.out.println("Введите имя пациента: ");
        Scanner searchName =new Scanner(System.in);
        String inputName = searchName.nextLine();
        for (Patient patient: array) {
            if (patient.name.contains(inputName)){
                System.out.println("Найден пациент: "+patient.name);
            }
        }
    }
}
