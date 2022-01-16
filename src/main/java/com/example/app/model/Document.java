package com.example.app.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "document")
public class Document {

	@Id
//	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="document_id", strategy = "uuid")
	@GeneratedValue(generator = "document_id")
	@Column(name = "document_id",length = 65555)
	private String documentId;

	private String documentName;

	private String documentType;

	private byte[] file;

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public Document(String documentId, String documentName, String documentType, byte[] file) {
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentType = documentType;
		this.file = file;
	}

	public Document (){

	}

	@Override
	public String toString() {
		return "Document{" +
				"documentId='" + documentId + '\'' +
				", documentName='" + documentName + '\'' +
				", documentType='" + documentType + '\'' +
				", file=" + Arrays.toString(file) +
				'}';
	}
}
