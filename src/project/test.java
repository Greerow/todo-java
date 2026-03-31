package project;

public class test {
    public static void main(String[] args) {
        // Создаём участника Иван, 25 лет
        Person person = new Person("Иван", 25);

        // Пытаемся установить некорректный возраст (-5) — должно появиться сообщение об ошибке,
        // а возраст остаться без изменений
        person.setMemberAge(-5);
        System.out.println(person.getMemberAge()); // Ожидается: 25

        // Теперь устанавливаем корректный возраст (35)
        person.setMemberAge(35);
        System.out.println(person.getMemberAge()); // Ожидается: 35
    }
}
class Person {
    private String memberName;
    private int memberAge;

    public Person(String memberName, int memberAge) {
        this.memberName = memberName;
        this.memberAge = memberAge;
    }
    public String getMemberName() {
        return memberName;
    }
    public int getMemberAge() {
        return memberAge;
    }
    public void setMemberName(String newName) {
        this.memberName = newName;
    }
    public void setMemberAge(int newAge) {
        if (newAge < 0) {
                System.out.println("Ошибка: Возраст не может быть отрицательным. Значение не изменено.");
        }
        else {
            this.memberAge = newAge;
        }
    }
}


