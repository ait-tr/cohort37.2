import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> list = new ArrayList<>(List.of(
                new Transaction(new Account("DE0001",new Person("Jack")), new Account("DE0002", new Person("John")), 1000.00,CurrencyCode.USD),
                new Transaction(new Account("DE0003",new Person("John")), new Account("DE0003", new Person("Lena")), 500.00,CurrencyCode.EUR),
                new Transaction(new Account("DE0001",new Person("Jack")), new Account("DE0003", new Person("Lena")), 100.00,CurrencyCode.EUR),
                new Transaction(new Account("DE0003",new Person("Lena")), new Account("DE0004", new Person("Nick")), 223.00,CurrencyCode.GBP),
                new Transaction(new Account("DE0004",new Person("Nick")), new Account("DE0002", new Person("John")), 10.50,CurrencyCode.EUR),
                new Transaction(new Account("DE0001",new Person("Jack")), new Account("DE0002", new Person("John")), 1000.00,CurrencyCode.USD)
            )
        );

        print(list);
        System.out.println("----- сортировка по умолчанию (id, по убыванию)  ----- ");
        sortAndPrint(list);

        System.out.println("-----     сортировка по сумме        ----- ");
        sortAndPrint(list, new ComparatorTransactionByAmount().reversed());

        System.out.println("-----     сортировка по коду валюты и сумме        ----- ");
        sortAndPrint(list, new ComparatorTransactionByCurrencyCode().thenComparing(new ComparatorTransactionByAmount().reversed())  );

        System.out.println("-----     фильтр по счету все транзакции с заданным счетом отправителя        ----- ");
        List<Transaction> resList1 = filter(list, new TransactionPredicateByDebitAccount("DE0001"));
        print(resList1);

        System.out.println("-----     фильтр по счету все транзакции с заданным счетом получателя        ----- ");
        List<Transaction> resList2 = filter(list, new TransactionPredicateByCreditAccount("DE0002"));
        print(resList2);

        System.out.println("-----     фильтр по счету все транзакции с заданным кодом валюты        ----- ");
        List<Transaction> resList3 = filter(list, new TransactionPredicateByCurrency(CurrencyCode.USD));
        print(resList2);

    }

    public static void  print(List<Transaction> list){
        for (Transaction t:list){
            System.out.println(t);
        }
    }

    public static void sortAndPrint(List<Transaction> list){
        sortAndPrint(list,null);
    }

    public static void sortAndPrint(List<Transaction> list, Comparator<Transaction> comparator){

        List<Transaction> tempList = new ArrayList<>(list);
        if (comparator==null){
            Collections.sort(tempList);
        } else {
            Collections.sort(tempList, comparator);
        }
        print(tempList);
    }

    public static List<Transaction> filter(List<Transaction> list, TransactionPredicate predicate ){
        List<Transaction> result = new ArrayList<>();
        for (Transaction t:list){
           if(predicate.test(t)){
               result.add(t);
           }
        }
        return result;
    }


}