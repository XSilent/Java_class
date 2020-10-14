
class Main 
{

    public static void main(String[] args) 
    {
        System.out.println("Hey");

        DataDemo someDemo = new DataDemo(); 
        
        someDemo.setFirstName("John");
        someDemo.setName("Doe");
        someDemo.setNotes("Something very important!");

        System.out.println(someDemo);
    }
}