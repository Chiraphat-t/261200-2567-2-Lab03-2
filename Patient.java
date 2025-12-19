public class Patient {
    private int id,birthYear,phoneNumber;
    private String name,bloodGroup;
    private double height,weight;

    public Patient(int id ,String name,int nbirthYear, double nheight,double nweight,String bloodGroup,int phoneNumber){

        this.id = id;
        this.name = name;
        if (nbirthYear>0){this.birthYear = nbirthYear;}
        if (nheight>0){this.height = nheight;}
        else if (nheight<0){System.out.println("invalid");}
        if (nweight>0){this.weight = nweight;}
        else if (nweight<0){System.out.println("invalid");}
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

    }

    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public int getBirthYear(){return this.birthYear;}
    public double getHeight(){return this.height;}
    public double getWeight(){return this.weight;}
    public int getAge(int currentYear){return (currentYear-this.birthYear);}

    public String getBloodGroup(){return this.bloodGroup;}
    public int getPhoneNumber(){return  this.phoneNumber;}
    public double getBMI(){
        if (weight<=0 || height<=0){return 0;}
        else {return this.weight/(this.height*this.height/10000);}
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BloodType: " + bloodGroup);
        System.out.println("Patient Phone Number: " + phoneNumber);
        System.out.println("Patient BMI : " + getBMI());
        System.out.println("--------------");
    }


    }

