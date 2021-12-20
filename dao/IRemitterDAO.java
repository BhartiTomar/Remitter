package dao;

import model.Remitter;

public interface IRemitterDAO {
	int addRemitter(Remitter rremitter);
	int updateRemitter(Remitter rremitter);
}