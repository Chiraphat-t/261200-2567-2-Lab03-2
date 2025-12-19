public class Patient {
    private int id,birthYear;
    private String name,bloodGroup,phoneNumber;
    private double height,weight;

    public Patient(int id ,String name,int nbirthYear, double nheight,double nweight,String nbloodGroup,String phoneNumber){

        this.id = id;
        this.name = name;
        if (nbirthYear>0){this.birthYear = nbirthYear;}
        else if (nbirthYear<=0){System.out.println("invalid year");}
        if (nheight>0){this.height = nheight;}
        else if (nheight<=0){System.out.println("invalid height");}
        if (nweight>0){this.weight = nweight;}
        else if (nweight<=0){System.out.println("invalid weight");}

        if (nbloodGroup == "A" ||nbloodGroup == "O" ||nbloodGroup == "B" ||nbloodGroup == "AB" ){this.bloodGroup = nbloodGroup;}
        else {
            this.bloodGroup="-";
            System.out.println("invalid bloodGroup");}
        this.phoneNumber = phoneNumber;

    }

    public int getId(){return this.id;}
    public String getName(){return this.name;}
    public int getBirthYear(){return this.birthYear;}
    public double getHeight(){return this.height;}
    public double getWeight(){return this.weight;}
    public int getAge(int currentYear){
        if (birthYear>0){return (currentYear-this.birthYear);}
        else {return 0;}
    }

    public String getBloodGroup(){return this.bloodGroup;}
    public String getPhoneNumber(){return  this.phoneNumber;}
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

