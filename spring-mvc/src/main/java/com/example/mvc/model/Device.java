package com.example.mvc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonTypeInfo(include= JsonTypeInfo.As.WRAPPER_OBJECT, use= JsonTypeInfo.Id.NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Device
{

	@NotNull
	private List<Display> displays;

	public void addDisplay(Display display)
	{
		displays.add(display);
	}
}
