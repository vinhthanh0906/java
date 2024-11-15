public class dog_test
{
   
    public static void main(String args[]) 
    {      
    Dog dog = new Dog();
    dog.setName("Amou");;
    dog.setAge(20);
    System.out.println("Name: " + dog.get_name());
    System.out.println("Age:" + dog.get_age());
    }
}
