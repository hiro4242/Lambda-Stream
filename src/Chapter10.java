import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter10 {

   public static void main(String[] args) throws Exception {
	        List<Task> list = new ArrayList<>();
	        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
	        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
	        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
	        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
	        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

	        // 以下記述
	        
	        List<Task> sortedTasks = list.stream()
	            .filter(l -> l.isDone() == false)
	            .sorted()
	            .collect(Collectors.toList());
	        
	        System.out.println("未完了のタスクの個数は" + sortedTasks.size() +
	        		"\n【未完了のタスクを昇順に並び替えて一覧表示】");
	        sortedTasks.forEach(System.out::println);
	        
	    }
}


