public class Dog
{
    String breed;
    String size;
    int age;
    String color;
     String getInfo()
     {
         return ("Breed is: "+breed + "Size is: " +size+" Age is: "+age+" Color is:"+color);
     }
     public static void main(String args[])
     {
         Dog dog=new Dog();
         dog.breed="german shephard";
         dog.size="large";
         dog.age=4;
         dog.color="dark brown";
         System.out.println(dog.getInfo());

     }
}