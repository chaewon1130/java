package com.pcwk.obj07.equals;

public class Person {
	long id;
	
	public Person(long id) {
		this.id = id;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (int) (id ^ (id >>> 32));
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}


	
	@Override
	public boolean equals(Object obj) {
		// Person의 id값으로 비교
		if(obj != null && obj instanceof Person) {
			return this.id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	
}
