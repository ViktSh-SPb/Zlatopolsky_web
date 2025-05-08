package org.example.zlatopolsky_web.services;

import org.springframework.stereotype.Service;

@Service
public class Chapter2Service {

    public Integer getLesson1aResult(Integer x){
        return 17*(x*x)-6*x+13;
    }

    public Integer getLesson1bResult(Integer a){
        return 3*(a*a)+5*a-21;
    }

    public double getLesson2Result(Integer a){
        return (a*a+10)/Math.sqrt(a*a+1);
    }

    public double getLesson3aResult(Integer a){
        return Math.sqrt((2*a+Math.sin(Math.abs(3*a)))/3.56);
    }

    public double getLesson3xResult(Integer x){
        return Math.sin((3.2+Math.sqrt(1+x))/Math.abs(5*x));
    }

    public Integer getLesson6Result(Integer h){
        final int R = 6350000;
        return (int)Math.round(Math.sqrt(2*R*h));
    }

    public Integer getLesson7volume(Integer x){
        return (int)Math.pow(x, 3);
    }

    public Integer getLesson7square(Integer x){
        return (int)Math.pow(x,2);
    }

    public Double getLesson8c(Integer r){
        return Math.PI*2*r;
    }

    public Double getLesson8s(Integer r){
        return Math.PI*Math.pow(r,2);
    }

    public double getLesson9zResult(Integer x, Integer y){

        return 2*Math.pow(x, 3)-3.44*x*y+2.3*Math.pow(x,2)-7.1*y+2;
    }

    public double getLesson9xResult(Integer a, Integer b){

        return 3.14*Math.pow(a+b, 3)+2.75*Math.pow(b, 2)-12.7*a-4.1;
    }

    public Double getLesson10ArithmeticMean(Integer first, Integer second){
        return (double)(first+second)/2;
    }

    public Double getLesson10GeometricMean(Integer first, Integer second){
        return Math.sqrt(first*second);
    }

    public Double getLesson11Density(Integer v, Integer m) { return (double)m/v; }

    public Double getLesson12Density(Integer citizens, Integer s) { return (double)citizens/s; }

    public Double getLesson13Root(Integer a, Integer b) { return (double)-b/a;}

    public Double getLesson14Hypotenuse(Integer katet1, Integer katet2) { return Math.sqrt(Math.pow(katet1,2)+Math.pow(katet2, 2));}

    public Double getLesson15S(Integer inner, Integer outer) { return Math.PI*(Math.pow(outer, 2)-Math.pow(inner, 2));}

    public Double getLesson15RelRadius(Integer inner, Integer outer) { return 150.0/outer*inner;}

    public Double getLesson16Perimeter(Integer katet1, Integer katet2) {
        double hypotenuse = Math.sqrt(Math.pow(katet1,2)+Math.pow(katet2, 2));
        return katet1+katet2+hypotenuse;}

    public Double getLesson17Perimeter(Integer base1, Integer base2, Integer height) {
        int katet1=height;
        double katet2 =(double)Math.abs(base1 - base2) / 2;
        System.out.println(katet2);
        double hyp = Math.sqrt(Math.pow(katet1,2)+Math.pow(katet2,2));
        return hyp*2+base1+base2;
    }

}
