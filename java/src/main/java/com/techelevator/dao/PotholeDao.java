package com.techelevator.dao;
import com.techelevator.model.Pothole;

import java.util.List;

public interface PotholeDao {
    Pothole getPotholeById (int id);

    Pothole createPothole (Pothole newPothole);
}