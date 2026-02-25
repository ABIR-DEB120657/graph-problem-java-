
package arrarys;

public class dadadidi {
    private static class human{
       private String name;
       private int age;
       String gender;
       String job;
       void human (){
           System.out.println(">>name>> "+name+" >>age>> "+age+" >>gender>> "+gender+" >>job>> "+job);
       }
       human(String name,int age,String gender,String job){
           this.name=name;
           this.age=age;
           this.gender=gender;
           this.job=job;
       }

       public static void main(String[] args) {
           human h1 = new human("Abir deb",21,"male","teacher");
           System.out.println(h1.name);
           h1.human();

        }

    }
}

