package JAVAANDDSA.ARRAY;

public class LINEARSEARCH { 
    public static int ITEM(String menu[],String key){
        for(int i = 0 ; i < menu.length; i++) {
            if (menu[i].equals(key)) {
              return i; 
            }
          }
          return -1;
        }
        public static void main(String[] args) {
           String menu[] = {"pizza","vadapav","samosa","chai","burger"};
           String key = "samosa";
           int index =ITEM(menu,key);
           if (index == -1) {
               System.out.println("NOT FOUND");
           }
           else {
               System.out.println("Samosa is at "  + (index + 1 ));
           }
        }
    
}
