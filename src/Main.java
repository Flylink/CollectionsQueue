import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();
        List<Person> people = generateClients();
        for (Person person : people) {
            queue.offer(person);
        }

        while (queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println("Посетитель " + person.getName() + person.getSurname() + "Прокатился");
            person.spendTicket();
            if (person.hasMoreTickets()) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> turn = new ArrayList<>();
        turn.add(new Person("Олег","Газманов", 5));
        turn.add(new Person("Александр","Волков", 7));
        turn.add(new Person("Максим","Галкин", 3));
        turn.add(new Person("Дмитрий","Верховный", 4));
        turn.add(new Person("Алексей","Спящих", 2));
        return turn;
    }
}