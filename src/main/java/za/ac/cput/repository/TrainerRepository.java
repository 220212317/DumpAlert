package za.ac.cput.repository;

import za.ac.cput.entity.Trainer;

import java.util.List;

public interface TrainerRepository extends IRepository<Trainer,String> {
    Trainer create(Trainer trainer);

    Trainer read(String trainerId);

    Trainer update(Trainer trainer);

    boolean delete(String trainerId);

    List<Trainer> getAll();
}
