/*
 * package com.ondemandcarwash.CustomerCarDetails.Service;
 * 
 * import java.io.IOException; import java.util.ArrayList; import
 * java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.core.io.ByteArrayResource; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.stereotype.Service; import
 * org.springframework.util.StringUtils; import
 * org.springframework.web.multipart.MultipartFile;
 * 
 * import com.ondemandcarwash.CustomerCarDetails.Model.CarModel; import
 * com.ondemandcarwash.CustomerCarDetails.Repository.ICarDAO;
 * 
 * @Service public class CarService {
 * 
 * @Autowired private ICarDAO carRepo;
 * 
 * public List<CarModel> getdetails() { return carRepo.findAll(); }
 * 
 * public List<CarModel> getbyuser(String user) { List<CarModel> usercar = new
 * ArrayList<CarModel>(); List<CarModel> all = carRepo.findAll(); for(CarModel l
 * : all) { if(l.getUsername().contentEquals(user)) { usercar.add(l); } } return
 * usercar; }
 * 
 * public CarModel getcarbyid(String id) { List<CarModel> car =
 * carRepo.findAll(); for(CarModel c : car) { if(c.getId().contentEquals(id)) {
 * return c; } } return null; }
 * 
 * 
 * public CarModel addcardetails(CarModel c) { return carRepo.save(c); }
 * 
 * public CarModel getcarimage(String id) { byte[] document = null; String
 * name=null; CarModel car=new CarModel(); List<CarModel>
 * allCer=carRepo.findAll(); for(CarModel c:allCer) {
 * if(c.getId().contentEquals(id)) { return c; } } return car; }
 * 
 * public CarModel addfiledetails(CarModel c,MultipartFile file) throws
 * IOException { String fileName =
 * StringUtils.cleanPath(file.getOriginalFilename());
 * 
 * c.setImage(file.getBytes()); c.setImagename(fileName); return
 * carRepo.save(c); }
 * 
 * 
 * public ResponseEntity<ByteArrayResource> downloadFile(String id) {
 * System.out.println("hi"); System.out.println(id); byte[] document = null;
 * String name=null; List<CarModel> allCer=carRepo.findAll(); for(CarModel
 * c:allCer) { if(c.getId().contentEquals(id)) { document=c.getImage();
 * name=c.getImagename()+"_"+c.getImagename();
 * 
 * } } return ResponseEntity.ok()
 * 
 * .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + name +
 * "\"") .body(new ByteArrayResource(document)); }
 * 
 * 
 * 
 * 
 * public boolean deletecar(String id) { Optional<CarModel> car =
 * carRepo.findById(id); if(car.isPresent()) { carRepo.deleteById(id); return
 * true; } return false; }
 * 
 * public boolean updatecardetails(CarModel car) { Optional<CarModel> available
 * = carRepo.findById(car.getId()); if(available.isPresent()) {
 * carRepo.save(car); return true; } return false; }
 * 
 * }
 */