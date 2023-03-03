
public class JavaProgram {

    public static void main(String[] args) {

        String users = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";

        Person []persons = new Person[3];

        int personsCounter = 0;

        String[] usersData = users.split("[./ ]");

        for (int i = 0; i < usersData.length; i += 3) {

            Person person = new Person(usersData[i], usersData[i+1], usersData[i+2]);

            persons[personsCounter]= person;

            personsCounter++;
        }

        for (Person person : persons){
            System.out.println(person.getInfo());
        }
    }
}




