package com.lti.app.dto;

import org.springframework.web.multipart.MultipartFile;

public class Imagedto {
	
	private MultipartFile imagefile;

	public MultipartFile getImagefile() {
		return imagefile;
	}

	public void setImagefile(MultipartFile imagefile) {
		this.imagefile = imagefile;
	}
	
	

}
