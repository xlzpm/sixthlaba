class Reader{
    public String FIO;
    public int LibraryCardId;
    public String Faculty;
    public String DateOfBirth;
    public String PhoneNumber;

    Reader(String FIO, int LibraryCardId, String Faculty, String DateOfBirth, String PhoneNumber){
        this.FIO = FIO;
        this.LibraryCardId = LibraryCardId;
        this.Faculty = Faculty;
        this.DateOfBirth = DateOfBirth;
        this.PhoneNumber = PhoneNumber;
    }

    public void TakeBook(int num){
        System.out.printf("%s взял(a) %d книги",FIO, num);
    }

    public void TakeBook(String... TitleOfBooks){
        System.out.print(FIO + " взял(a) книги: ");
        for (String B : TitleOfBooks){
            System.out.print(B + " ");
        }
    }

    public void ReturnBook(String... TitleOfBooks){
        System.out.print(FIO + " вернул(a) книги: ");
        for (String B : TitleOfBooks){
            System.out.print(B + " ");
        }
    }

    public void ReturnBook(int num){
        System.out.printf("%s вернул(a) %d книг", FIO, num);
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Reader r1 = new Reader("Дугин Илья Алексеевич", 1, "Информационные технологии", "06.06.1996", "111-1234");
        Reader r2 = new Reader("Лапицкий Даниил Владимирович", 2, "Информационные технологии", "01.11.2006", "1111-2345");
        Reader r3 = new Reader("Романов Иван Игоревич", 3, "Информационные технологии", "15.01.2007", "1111-3456");
        Reader r4 = new Reader("Уханов Алексей Александрович", 4, "Информационные технологии", "06.12.2014", "1111-4567");
        Reader r5 = new Reader("Ермохин Дмитрий Евгеньевич", 5, "Информационные технологии", "27.09.2005", "1111-5678");
        Reader[] Readers = {r1, r2, r3, r4,r5};
        Readers[0].TakeBook(3);
        System.out.println();
        Readers [1].TakeBook("Гарри Поттер и филосовский камень,", "Оно,", "Война и мир" );
        System.out.println();
        Readers[2].ReturnBook("К самому себе,", "Воля к власти");
        System.out.println();
        Readers[3].ReturnBook(6);
    }
}
