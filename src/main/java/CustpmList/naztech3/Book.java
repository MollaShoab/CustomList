package CustpmList.naztech3;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data

public class Book {

	@NonNull
	String authorNameString;
	@NonNull
	String bookNameString;
	@NonNull
	Integer isbnNo;
	@NonNull
	LocalDate pubDate;
	@NonNull
	Integer prize;

}
