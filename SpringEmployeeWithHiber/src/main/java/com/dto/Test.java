package com.dto;
import javax.persistence.*;

public class Test {
  public static void main(String[] args) {
	EntityManager manager = Persistence.createEntityManagerFactory("development").createEntityManager();
	System.out.println(manager);
}
}
