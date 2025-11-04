package com.tns.Generics;

public class GenericClass <E>
{
	E data;

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
    }
}