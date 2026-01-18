package com.example.dentalclinicspringboot.controller;

import com.example.dentalclinicspringboot.model.Appointment;
import com.example.dentalclinicspringboot.model.Room;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    List<Appointment> appointments = new ArrayList<>();

    public AppointmentController(){
        LocalDateTime start1 = LocalDateTime.of(2026, 1, 18, 14, 30);
        LocalDateTime start2 = LocalDateTime.of(2026, 1, 19, 14, 30);
        this.appointments.add(new Appointment(0,start1,60,1, 1, 1, 1 ));
        this.appointments.add(new Appointment(1,start2,60,2, 2, 2, 2 ));
    }

    @GetMapping("{id}")
    public Appointment getAppointmentsById(@PathVariable int id){
        for (Appointment appointment : appointments) {
            if (appointment.getId() == id)
                return appointment;
        }
        return new Appointment();
    }

    @GetMapping
    public List<Appointment> getAppointmentsSearch(@RequestParam(required = false) LocalDateTime date,@RequestParam(required = false) Integer pid){
        List<Appointment> returnedAppointments = new ArrayList<>();
        for (Appointment appointment : appointments) {
            boolean matches = true;
            if (pid != null && !(Objects.equals(appointment.getPId(), pid))) {
                matches = false;
            }

            if (date != null && !appointment.getStartDate().equals(date)) {
                matches = false;
            }

            if (matches) {
                returnedAppointments.add(appointment);
            }}
        return returnedAppointments;
    }
    @DeleteMapping("{id}")
    public void delAppointmentById(@PathVariable Integer id){
        appointments.removeIf(appointment -> appointment.getId() == id);
    }
    @PostMapping
    public void addAppointment(@RequestBody Appointment appointment){
        appointments.add(appointment);
    }
}
