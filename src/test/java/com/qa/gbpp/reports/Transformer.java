package com.qa.gbpp.reports;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Transformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testconstructor, Method method) {


        annotation.setRetryAnalyzer(RetryAnalyzer.class);

    }
}
