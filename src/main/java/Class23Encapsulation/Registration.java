package Class23Encapsulation;

public class Registration {
    private String email;
    private String Username;
    private String password;

    public Registration(String email, String Username,
                       String password){
       this.email=email;
       this.Username=Username;
       this.password=password;
   }
   public void setEmail(){
       if(email.contains("yahoo")){
           this.email=email;
       }else{
           System.out.println("Error");
       }
   } public void setUsername(){
       if(!Username.isEmpty() && Username.length()>6){
           this.Username = Username;
       }else{
           System.out.println("Error Username");
       }
   } public void setPassword() {
        if (!password.isEmpty() && password.length() > 6) {
            this.password = password;
        } else {
            System.out.println("Error Password");
        }
    }
}
