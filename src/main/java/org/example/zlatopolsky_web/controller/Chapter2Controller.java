package org.example.zlatopolsky_web.controller;

import org.example.zlatopolsky_web.services.Chapter2Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/chapter2")
public class Chapter2Controller {
    private final Chapter2Service chapter2Service;

    public Chapter2Controller(Chapter2Service chapter2Service) {
        this.chapter2Service = chapter2Service;
    }


    @GetMapping("/lesson1")
    public String getLesson1Page(){
        return "chapter2/2.1";
    }

    @PostMapping("/lesson1")
    public String getLesson1ResultPage(Model model,
                                        @RequestParam("a") Integer a,
                                        @RequestParam("x") Integer x){
        model.addAttribute("a", a);
        model.addAttribute("x", x);
        model.addAttribute("ya", chapter2Service.getLesson1aResult(x));
        model.addAttribute("yb", chapter2Service.getLesson1bResult(a));
        return "chapter2/2.1_result";
    }

    @GetMapping("/lesson2")
    public String getLesson17Page(){
        return "chapter2/2.2";
    }

    @PostMapping("/lesson2")
    public String getLesson17ResultPage(Model model, @RequestParam("a") Integer a){
        model.addAttribute("a", a);
        model.addAttribute("result", chapter2Service.getLesson2Result(a));
        return "chapter2/2.2_result";
    }

    @GetMapping("/lesson3")
    public String getLesson3Page(){
        return "chapter2/2.3";
    }

    @PostMapping("/lesson3")
    public String getLesson3ResultPage(Model model,
                                       @RequestParam("a") Integer a,
                                       @RequestParam("x") Integer x){
        model.addAttribute("a", a);
        model.addAttribute("x", x);
        model.addAttribute("result_a", chapter2Service.getLesson3aResult(a));
        model.addAttribute("result_x", chapter2Service.getLesson3xResult(x));
        return "chapter2/2.3_result";
    }

    @GetMapping("/lesson4")
    public String getLesson4Page(){
        return "chapter2/2.4";
    }

    @PostMapping("/lesson4")
    public String getLesson4ResultPage(Model model, @RequestParam("x") Integer x){
        model.addAttribute("x", x);
        model.addAttribute("perimeter", 4*x);
        return "chapter2/2.4_result";
    }

    @GetMapping("/lesson5")
    public String getLesson5Page(){
        return "chapter2/2.5";
    }

    @PostMapping("/lesson5")
    public String getLesson5ResultPage(Model model, @RequestParam("radius") Integer radius){
        model.addAttribute("radius", radius);
        model.addAttribute("diameter", 2*radius);
        return "chapter2/2.5_result";
    }

    @GetMapping("/lesson6")
    public String getLesson6Page(){
        return "chapter2/2.6";
    }

    @PostMapping("/lesson6")
    public String getLesson6ResultPage(Model model, @RequestParam("h") Integer h){
        model.addAttribute("h", h);
        model.addAttribute("l", chapter2Service.getLesson6Result(h));
        return "chapter2/2.6_result";
    }

    @GetMapping("/lesson7")
    public String getLesson7Page(){
        return "chapter2/2.7";
    }

    @PostMapping("/lesson7")
    public String getLesson7ResultPage(Model model, @RequestParam("x") Integer x){
        model.addAttribute("x", x);
        model.addAttribute("v", chapter2Service.getLesson7volume(x));
        model.addAttribute("s", chapter2Service.getLesson7square(x));
        return "chapter2/2.7_result";
    }

    @GetMapping("/lesson8")
    public String getLesson8Page(){
        return "chapter2/2.8";
    }

    @PostMapping("/lesson8")
    public String getLesson8ResultPage(Model model, @RequestParam("r") Integer r){
        model.addAttribute("r", r);
        model.addAttribute("c", chapter2Service.getLesson8c(r));
        model.addAttribute("s", chapter2Service.getLesson8s(r));
        return "chapter2/2.8_result";
    }

    @GetMapping("/lesson9")
    public String getLesson9Page(){
        return "chapter2/2.9";
    }

    @PostMapping("/lesson9")
    public String getLesson9ResultPage(Model model,
                                       @RequestParam("x") Integer x,
                                       @RequestParam("y") Integer y,
                                       @RequestParam("a") Integer a,
                                       @RequestParam("b") Integer b){
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("return_z", chapter2Service.getLesson9zResult(x,y));
        model.addAttribute("return_x", chapter2Service.getLesson9xResult(a,b));
        return "chapter2/2.9_result";
    }

    @GetMapping("/lesson10")
    public String getLesson10Page(){
        return "chapter2/2.10";
    }

    @PostMapping("/lesson10")
    public String getLesson10ResultPage(Model model,
                                        @RequestParam("first") Integer first,
                                        @RequestParam("second") Integer second){
        model.addAttribute("first", first);
        model.addAttribute("second", second);
        model.addAttribute("arithmetic_mean", chapter2Service.getLesson10ArithmeticMean(first, second));
        model.addAttribute("geometric_mean", chapter2Service.getLesson10GeometricMean(first, second));
        return "chapter2/2.10_result";
    }

    @GetMapping("/lesson11")
    public String getLesson11Page(){
        return "chapter2/2.11";
    }

    @PostMapping("/lesson11")
    public String getLesson11ResultPage(Model model,
                                        @RequestParam("v") Integer v,
                                        @RequestParam("m") Integer m){
        model.addAttribute("v", v);
        model.addAttribute("m", m);
        model.addAttribute("density", chapter2Service.getLesson11Density(v, m));
        return "chapter2/2.11_result";
    }

    @GetMapping("/lesson12")
    public String getLesson12Page(){
        return "chapter2/2.12";
    }

    @PostMapping("/lesson12")
    public String getLesson12ResultPage(Model model,
                                        @RequestParam("citizens") Integer citizens,
                                        @RequestParam("s") Integer s){
        model.addAttribute("citizens", citizens);
        model.addAttribute("s", s);
        model.addAttribute("density", chapter2Service.getLesson12Density(citizens, s));
        return "chapter2/2.12_result";
    }

    @GetMapping("/lesson13")
    public String getLesson13Page(){
        return "chapter2/2.13";
    }

    @PostMapping("/lesson13")
    public String getLesson13ResultPage(Model model,
                                        @RequestParam("a") Integer a,
                                        @RequestParam("b") Integer b){
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("x", chapter2Service.getLesson13Root(a, b));
        return "chapter2/2.13_result";
    }

    @GetMapping("/lesson14")
    public String getLesson14Page(){
        return "chapter2/2.14";
    }

    @PostMapping("/lesson14")
    public String getLesson14ResultPage(Model model,
                                        @RequestParam("katet1") Integer katet1,
                                        @RequestParam("katet2") Integer katet2){
        model.addAttribute("katet1", katet1);
        model.addAttribute("katet2", katet2);
        model.addAttribute("hyp", chapter2Service.getLesson14Hypotenuse(katet1, katet2));
        return "chapter2/2.14_result";
    }

    @GetMapping("/lesson15")
    public String getLesson15Page(){
        return "chapter2/2.15";
    }

    @PostMapping("/lesson15")
    public String getLesson15ResultPage(Model model,
                                        @RequestParam("inner") Integer inner,
                                        @RequestParam("outer") Integer outer){
        model.addAttribute("inner", inner);
        model.addAttribute("outer", outer);
        model.addAttribute("s", chapter2Service.getLesson15S(inner, outer));
        model.addAttribute("relInner", chapter2Service.getLesson15RelRadius(inner, outer));
        System.out.println(chapter2Service.getLesson15RelRadius(inner, outer));
        return "chapter2/2.15_result";
    }
}