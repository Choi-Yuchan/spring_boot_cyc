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
public class CircleVO {
	private double radius;
	private double PI = Math.PI;

	
	public double getArea() {
		return radius*radius*PI;
	}

	
}
