public class Service {

    private String serviceName;
    private int pagio;
    private int serviceType;
    private double cost;

    public Service(){
    }

    public Service(String serviceName, int pagio){
        this.serviceName=serviceName;
        this.pagio=pagio;

    }

    public String getServiceName(){
        return serviceName;
    }
    
    public int getPagio(){
        return pagio;
    }

    public void setServiceType(int serviceType){
        this.serviceType=serviceType;
        if(serviceType==1){
            cost=cost-0.2*cost;
        }else if(serviceType==2){
            cost=cost-0.25*cost;
        }else{
            cost=cost-cost*0.3;
        }


    }

    public double getCost(double cost){
        return cost;
    }

    public String toStringName(){
        return ("Name: "+ getServiceName());
    }

    public String toString(){
        return ("Name: "+ getServiceName() + "\t Pagio: "+ getPagio());
    }













    


}
