// using Accessor and mutator method implementation 
package lab12016;

public class Accessor_Mutator_Method {

    private int IDNO;
    private String Name;

    //write a method fro getter and setter methods to access and modify private variable sin the class
    public int GetIDNO()// this methode used to return id
    {
        return IDNO;
    }

    public void SetIDNO(int id) {
        this.IDNO = id;// the local variable equal with method variable 

    }

    public String GetName(String name) {
        return name;
    }

    public void SetName(String name) {
        this.Name = name;
    }

    public void Display() {
        System.out.println("the Student Infromation  Inforamtion ");
        System.out.println("Your IDNO:" + IDNO);
        System.out.println("Your Name:" + Name);
    }
   public static void main(String[] args) {
        Accessor_Mutator_Method obj = new Accessor_Mutator_Method();
        obj.SetName("Abebe");// assign value for the string 
        obj.SetIDNO(3455);
        obj.GetIDNO();
        obj.GetName("Kebede");
        obj.Display();
    }
}
