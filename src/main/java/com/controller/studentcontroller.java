package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.student1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

@Controller
public class studentcontroller {
    EntityManagerFactory emf =Persistence.createEntityManagerFactory("jsp");

    // Open Registration Page
    @RequestMapping("/reg")
    public String register() {
        return "register.jsp";
    }

    // INSERT
    @RequestMapping("/save")
    public String save(student1 s) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(s);
        et.commit();
        em.close();
        return "save.jsp";
    }
    // FETCH ALL
    @RequestMapping("/fetch")
    public String fetch(Model model) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<student1> query =em.createQuery("from Student", student1.class);
        List<student1> list = query.getResultList();
        model.addAttribute("stu", list);
        em.close();
        return "display.jsp";
    }

    // DELETE
    @RequestMapping("/delete")
    public String delete(@RequestParam("id") int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        student1 s = em.find(student1.class, id);
        if (s != null) {
            et.begin();
            em.remove(s);
            et.commit();
        }
        em.close();
        return "redirect:/fetch";
    }
    // UPDATE
    @RequestMapping("/update")
    public String update(student1 s) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        student1 dbStudent =em.find(student1.class, s.getId());
        if (dbStudent != null) {

            et.begin();
            dbStudent.setName(s.getName());
            dbStudent.setAge(s.getAge());
            et.commit();
        }
        em.close();
        return "redirect:/fetch";
    }

    // OPEN UPDATE PAGE
    @RequestMapping("/updatepage")
    public String updatePage() {
        return "update.jsp";
    }

    // OPEN DELETE PAGE
    @RequestMapping("/deletepage")
    public String deletePage() {
        return "delete.jsp";
    }
}