class Animal{
String name;
public void eat(){
System.out.println("eating...");
}
}
class Dog extends Animal{
public void display()
{
System.out.println("name is:" +name);
}
}
class Main{
public static void main(String args[]){
Dog labrador=new Dog();
labrador.name="jimmi";
labrador.display();
labrador.eat();
}
}
