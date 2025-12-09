import java.util.*;
import java.time.LocalDate;
public class mainApp {
//Omada 67
//Gewrgios Vlasshs:3200020, Thomas Vasilas:3200012, Iwanna Zaxarakh:3200051

    public static void main( String args[]){
        Scanner input = new Scanner(System.in);
        symvolaio_kin s1 = new symvolaio_kin("UNLIMITED 850 ",10,850,200,0.1,0.2);
        symvolaio_kin s2 = new symvolaio_kin("UNLIMITED 1500",10,1500,500,0.2,0.4);
        Kartosymvolaio k1 = new Kartosymvolaio("MONTH FAVORITE 1",10, 1000, 800, 0.10, 0.12, 20);
        Kartosymvolaio k2 = new Kartosymvolaio("MONTH FAVORITE 2",10,1500, 1000, 0.12, 0.15, 20);
        Internet i1 = new Internet("GIGA WEEK     ",10, 6000,0.1);
        Internet i2 = new Internet("GIGA MONTH    ",10,10000,0.2);
        ServiceCollection s=new ServiceCollection();
        s.addService(s1);
        s.addService(s2);
        s.addService(k1);
        s.addService(k2);
        s.addService(i1);
        s.addService(i2);
        SymvolaiaCollection g=new SymvolaiaCollection();
        Symvolaia sym1 = new Symvolaia(1,s1.getServiceName(),"Giwrgos Vlasshs","690001",LocalDate.now(),"Cash");
        Symvolaia sym2 = new Symvolaia(2,s1.getServiceName(),"Iwanna Zaxarakh","690002",LocalDate.now(),"Card");
        Symvolaia sym3 = new Symvolaia(3,s2.getServiceName(),"Thomas Vasilas","690003",LocalDate.now(),"Cash");
        Symvolaia sym4 = new Symvolaia(4,s2.getServiceName(),"Giwrgos Vlasshs","690004",LocalDate.now(),"Card");
        Symvolaia sym5 = new Symvolaia(5,k1.getServiceName(),"Thomas Vasilas","690005",LocalDate.now(),"Card");
        Symvolaia sym6 = new Symvolaia(6,k1.getServiceName(),"Giwrgos Vlasshs","690006",LocalDate.now(),"Cash");
        Symvolaia sym7 = new Symvolaia(7,k2.getServiceName(),"Thomas Vasilas","690007",LocalDate.now(),"Cash");
        Symvolaia sym8 = new Symvolaia(8,k2.getServiceName(),"Giwrgos Vlasshs","690008",LocalDate.now(),"Card");
        Symvolaia sym9 = new Symvolaia(9,i1.getServiceName(),"tyxaio onoma","690009",LocalDate.now(),"Cash");
        Symvolaia sym10 = new Symvolaia(10,i1.getServiceName(),"tyxaio onoma2","690010",LocalDate.now(),"Card");
        Symvolaia sym11 = new Symvolaia(11,i2.getServiceName(),"Iwanna Zaxarakh","690011",LocalDate.now(),"Cash");
        Symvolaia sym12 = new Symvolaia(12,i2.getServiceName(),"Zaxarakh Iwanna","690012",LocalDate.now(),"Card");
        g.addSymvolaia(sym1);
        g.addSymvolaia(sym2);
        g.addSymvolaia(sym3);
        g.addSymvolaia(sym4);
        g.addSymvolaia(sym5);
        g.addSymvolaia(sym6);
        g.addSymvolaia(sym7);
        g.addSymvolaia(sym8);
        g.addSymvolaia(sym9);
        g.addSymvolaia(sym10);
        g.addSymvolaia(sym11);
        g.addSymvolaia(sym12);
        
        
        int answerNum;
        boolean flag=false;
        int ID=12;
        String answer,name,S_name,number,payment;
        LocalDate date;
        while (!flag){
        System.out.println("1. See Services");
        System.out.println("2. Create a new contract");
        System.out.println("3. View active contracts of a specific service");
        System.out.println("4. Update statistics of an active contract");
        System.out.println("5. Calculation of the total monthly cost");
        System.out.println("6. Current client stats");
        System.out.println("0. Exit");
        System.out.println("9. Return to menu");
        answer=input.nextLine();
        if (answer.equals("1")){
            System.out.println("1. Contract");
            System.out.println("2. Card-contract");
            System.out.println("3. Internet contract");
            answer=input.nextLine();
            if(answer.equals("1")){
                //emfanisi simvolaiwn
                System.out.println(s1);
                System.out.println(s2);
            }else if(answer.equals("2")){
                //emfanisi kartosymvolaiwn
                System.out.println(k1);
                System.out.println(k2);
            }else if(answer.equals("3")){
                //emfanisi internet
                System.out.println(i1);
                System.out.println(i2);
            }else{
                continue;
            }
        }else if(answer.equals("2")){
            System.out.println("Which contract do you want?");
            System.out.println("1. Contract");
            System.out.println("2. Card Contract");
            System.out.println("3. Internet contract");
            answer=input.nextLine();
            if (answer.equals("1")){
                //emfanisi contracts with numbers
                System.out.println("Choose Mobile Contract:");
                System.out.println("1."+s1);
                System.out.println("2."+s2);
                answer=input.nextLine();
                if (answer.equals("1")){
                    S_name=s1.getServiceName();
                }else {
                    S_name=s2.getServiceName();
                }
            }else if(answer.equals("2")){
                System.out.println("Choose Mobile Card-Contract:");
                System.out.println("1."+k1);
                System.out.println("2."+k2);
                answer=input.nextLine();
                if (answer.equals("1")){
                    S_name=k1.getServiceName();
                }else {
                    S_name=k2.getServiceName();
                }
                
            }else {
                System.out.println("Choose Mobile Internet Contract:");
                System.out.println("1."+i1);
                System.out.println("2."+i2);
                answer=input.nextLine();
                if (answer.equals("1")){
                    S_name=i1.getServiceName();
                }else {
                    S_name=i2.getServiceName();
                }
            }
            System.out.println("Enter Name: ");
            name=input.nextLine();
            System.out.println("Enter Tel_number: ");
            number=input.nextLine();
            System.out.println("Enter Payment_Method : ");
            payment=input.nextLine();
            date= LocalDate.now();
            ID+=1; 
            Symvolaia new_sym = new Symvolaia(ID,S_name,name,number,date,payment);
            g.addSymvolaia(new_sym);
        }else if (answer.equals("3")){
            System.out.println("Which contract do you want?");
            System.out.println("1. Contract");
            System.out.println("2. Card Contract");
            System.out.println("3. Internet contract");
            answer=input.nextLine();
            if (answer.equals("1")){
                //emfanisi contracts with numbers
                System.out.println("Choose Mobile Contract:");
                System.out.println("1."+s1);
                System.out.println("2."+s2);
                answer=input.nextLine();
                if (answer.equals("1")){
                    S_name=s1.getServiceName();
                }else {
                    S_name=s2.getServiceName();
                }
            }else if(answer.equals("2")){
                System.out.println("Choose Mobile Card-Contract:");
                System.out.println("1."+k1);
                System.out.println("2."+k2);
                answer=input.nextLine();
                if (answer.equals("1")){
                    S_name=k1.getServiceName();
                }else {
                    S_name=k2.getServiceName();
                }
                
            }else {
                System.out.println("Choose Mobile Internet Contract:");
                System.out.println("1."+i1);
                System.out.println("2."+i2);
                answer=input.nextLine();
                if (answer.equals("1")){
                    S_name=i1.getServiceName();
                }else {
                    S_name=i2.getServiceName();
                }

            }
            g.certainSymvolaia(S_name);
            
        }else if (answer.equals("4")){
            
            System.out.println("Choose a contract by the ID number: ");
            g.listSymvolaia();
            answer=input.nextLine();
            int index=(Integer.valueOf(answer)-1);
            Symvolaia k=g.getSymvolaia(index);
            if ((k.get_yphresia()=="GIGA WEEK     ") || (k.get_yphresia()=="GIGA MONTH    ") ){
                System.out.println("Set data: ");
                answerNum=input.nextInt(); 
                k.setData(answerNum);
            }else{
                System.out.println("Set lepta omilias: ");
                answerNum=input.nextInt(); 
                k.setXronosOmilias(answerNum);
                System.out.println("Set SMS: ");
                answerNum=input.nextInt(); 
                k.setSMS(answerNum);
            }
            
        }else if(answer.equals("5")){
            for (int counter = 0; counter < g.sizeSymvolaia(); counter++){
                double cost=10;
                Symvolaia k=g.getSymvolaia(counter);
                if (k.get_yphresia()=="GIGA WEEK     "){
                    if (k.getOgkosData()>6000){
                        cost+=(k.getOgkosData()-6000)*0.1;
                    }
    
                }else if(k.get_yphresia()=="GIGA MONTH    "){
                    if (k.getOgkosData()>10000){
                        cost+=(k.getOgkosData()-10000)*0.2;}
                }else if(k.get_yphresia()=="MONTH FAVORITE 1"){
                    if (k.getXronosOmilias()>1000){
                        cost+=(k.getXronosOmilias()-1000)*0.12;

                    }
                    if (k.getSms()>800){
                        cost+=(k.getSms()-800)*0.1;
                    }
                    cost=k1.getYpoloipo()-cost;
                }else if(k.get_yphresia()=="MONTH FAVORITE 2"){
                    if (k.getXronosOmilias()>1500){
                        cost+=(k.getXronosOmilias()-1500)*0.15;
                    }
                    if (k.getSms()>1000){
                        cost+=(k.getSms()-1000)*0.12;
                    }
                    cost=k2.getYpoloipo()-cost;
                }else if(k.get_yphresia()=="UNLIMITED 850 "){
                    if (k.getXronosOmilias()>850){
                        cost+=(k.getXronosOmilias()-850)*0.1;
                    }
                    if (k.getSms()>200){
                        cost+=(k.getSms()-200)*0.2;
                    }
                }else if(k.get_yphresia()=="UNLIMITED 1500"){
                    if (k.getXronosOmilias()>1500){
                        cost+=(k.getXronosOmilias()-1500)*0.2;
                    }
                    if (k.getSms()>500){
                        cost+=(k.getSms()-500)*0.4;
                    }
                }
                
                System.out.println(k.toString2()+cost);

            } 


        }else if(answer.equals("6")){
            for (int counter = 0; counter < g.sizeSymvolaia(); counter++){
                int fData=0,fSMS=0,fLepta=0;
                double fYpoloipo=0;
                Symvolaia k=g.getSymvolaia(counter);
                if (k.get_yphresia()=="GIGA WEEK     "){
                    fData=6000-k.getOgkosData();
                }else if(k.get_yphresia()=="GIGA MONTH    "){
                    fData=10000-k.getOgkosData();
                }else if(k.get_yphresia()=="MONTH FAVORITE 1"){
                    if (k.getXronosOmilias()>1000){
                        fYpoloipo+=(k.getXronosOmilias()-1000)*0.12;

                    }
                    if (k.getSms()>800){
                        fYpoloipo+=(k.getSms()-800)*0.1;
                    }
                    fYpoloipo=k1.getYpoloipo()-fYpoloipo-k1.getPagio();
                    fLepta=1000-k.getXronosOmilias();
                    fSMS=800-k.getSms();

                }else if(k.get_yphresia()=="MONTH FAVORITE 2"){
                    if (k.getXronosOmilias()>1500){
                        fYpoloipo+=(k.getXronosOmilias()-1500)*0.15;
                    }
                    if (k.getSms()>1000){
                        fYpoloipo+=(k.getSms()-1000)*0.12;
                    }
                    fYpoloipo=k2.getYpoloipo()-fYpoloipo-k2.getPagio();
                    fLepta=1500-k.getXronosOmilias();
                    fSMS=1000-k.getSms();
                
                }else if(k.get_yphresia()=="UNLIMITED 850 "){
                    fLepta=850-k.getXronosOmilias();
                    fSMS=200-k.getSms();
                }else if(k.get_yphresia()=="UNLIMITED 1500"){
                    fLepta=1500-k.getXronosOmilias();
                    fSMS=500-k.getSms();
                }
                if (fLepta<0){
                    fLepta=0;
                }
                if (fSMS<0){
                    fSMS=0;
                }
                if(fData<0){
                    fData=0;

                }
                System.out.println(k.toString3(fLepta, fSMS, fData, fYpoloipo));

            } 
        }else if(answer.equals("0")){
            break;
        }
        
    }


        

        


        
    }
}    

