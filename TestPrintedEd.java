import java.util.Scanner;

public class TestPrintedEd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Введите количество объектов в книжном магазине");
        n=s.nextInt();
        BookShop bs=new BookShop();
        for(int i=0;i<n;i++){
            int type,max;
            System.out.println("Чтобы добавить книгу нажмите 1, журнал нажмите 2");
            type=s.nextInt();
            System.out.println("Введите название");
            String name=s.next();
            System.out.println("Введите количество страниц");
            int maxprint=s.nextInt();
            if (type==1){
                System.out.println("Введите номер производства");
                max=s.nextInt();
                Book b=new Book(name,maxprint,max);
                bs.Add(b);
            }
            else{
                System.out.println("Введите максимальный тираж");
                max=s.nextInt();
                Magazine m=new Magazine(name,maxprint,max);
                bs.Add(m);
            }

        }
        bs.printBookShop();
        bs.count();
    }

}
