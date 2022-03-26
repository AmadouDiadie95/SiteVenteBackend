package ab.tech.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import ab.tech.repositories.ImageRepository;
import ab.tech.repositories.ProductRepository;

@RestController
//@CrossOrigin(origins = "http://localhost:8082") open for specific port
@CrossOrigin() // open for all ports
public class ImageController {

    @Autowired
    ImageRepository imageRepository;
    @Autowired
    ProductRepository productRepository ;

//    @PostMapping("/upload/image")
//    public ResponseEntity<ImageUploadResponse> uplaodImage(@RequestParam("image") MultipartFile file)
//            throws IOException {
//
//        imageRepository.save(Image.builder()
//                .name(file.getOriginalFilename())
//                .type(file.getContentType())
//                .image(ImageUtility.compressImage(file.getBytes())).build());
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(new ImageUploadResponse("Image uploaded successfully: " +
//                        file.getOriginalFilename()));
//    }
//    
//    @PostMapping("/upload/product")
//    public Product uplaodProduct (@RequestBody Product product)
//            throws IOException {
//    	if (product.getFile() != null) {
//    		product.setImage(ImageUtility.compressImage(product.getFile().getBytes()));
//		}
//    	productRepository.save(product) ;
//        return product ;
//    }
//
//    @GetMapping(path = {"/get/image/info/{name}"})
//    public Image getImageDetails(@PathVariable("name") String name) throws IOException {
//
//        final Optional<Image> dbImage = imageRepository.findByName(name);
//
//        return Image.builder()
//                .name(dbImage.get().getName())
//                .type(dbImage.get().getType())
//                .image(ImageUtility.decompressImage(dbImage.get().getImage())).build();
//    }
//    
//    @GetMapping(path = {"/get/product/{productName}"})
//    public Product getProductDetails(@PathVariable("productName") String productName) throws IOException {
//            Product dbProduct = productRepository.findByName(productName);
//            if (dbProduct.getImage() != null) {
//            	dbProduct.setImage(ImageUtility.decompressImage(dbProduct.getImage()));
//    		}
//            return dbProduct ;
//        }
//
//    @GetMapping(path = {"/get/image/{name}"})
//    public ResponseEntity<byte[]> getImage(@PathVariable("name") String name) throws IOException {
//
//        final Optional<Image> dbImage = imageRepository.findByName(name);
//
//        return ResponseEntity
//                .ok()
//                .contentType(MediaType.valueOf(dbImage.get().getType()))
//                .body(ImageUtility.decompressImage(dbImage.get().getImage()));
//    }
//


}