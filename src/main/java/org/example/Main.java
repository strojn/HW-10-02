package org.example;

import org.example.annotation.inherited.Plane;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane();
        Annotation[] classAnnotations = plane.getClass().getAnnotations();

        System.out.println(plane.getClass().getName() + "\nAnnotations:");
        for (Annotation annotation : classAnnotations)
            System.out.println("\t" + annotation);

        Method[] classMethods = plane.getClass().getMethods();
        System.out.println("Method annotations:");
        for (Method method : classMethods) {
            Annotation[] methodAnnotations = method.getAnnotations();
            if (methodAnnotations.length > 0) {
                System.out.println("\t" + method.getName() + "():");
            }
            for (Annotation annotation : methodAnnotations) {
                System.out.println("\t" + annotation);
            }
        }
    }
}