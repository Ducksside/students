package telran.java45.student.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class StudentUpdateDto {

	String name;
	String password;
}
