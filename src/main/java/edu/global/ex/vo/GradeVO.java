package edu.global.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GradeVO {
	private int kor;
	private int eng;
	private int math;
	private char grade;
	
	public int getTotal() {
		return kor + eng + math;
	}
	public double getAvg() {
		return (kor +eng + math)/3.0;
	}

	public char getGrade() {
		double avg = getAvg();
		
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'E';
		}

		return grade;
	}
}
