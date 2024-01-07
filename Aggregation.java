class Address{
String city,state,country;
public Address(String city,String state,String country){
this.city=city;
this.state=state;
this.country=country;
}
}
class Emp{
int id;
String name;
Address obaddress;
public Emp(int id,String name,Address obaddress){
this.id=id;
this.name=name;
this.obaddress=obaddress;
}
void display(){
System.out.println(id+" " +name);
System.out.println(obaddress.city+" "+obaddress.state+" "+obaddress.country);
}
public static void main(String args[]){
Address address1=new Address("gzb","UP","india");
Address address2=new Address("gno","UP","india");
Emp e1=new Emp(111,"ammu",address1);
Emp e2=new Emp(112,"bujji",address2);
e1.display();
e2.display();
}
}