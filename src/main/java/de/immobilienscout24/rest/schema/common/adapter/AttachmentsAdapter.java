package de.immobilienscout24.rest.schema.common.adapter;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import de.immobilienscout24.rest.schema.common._1.Attachments;

public class AttachmentsAdapter extends XmlAdapter<String, Attachments> {

	private Map<String, Attachments> nodes = new HashMap<String, Attachments>();

	public Map<String, Attachments> getNodes() {
		return nodes;
	}

	@Override
	public Attachments unmarshal(String v) throws Exception {

		System.out.println("value:" + v);
		return nodes.get(v);
	}

	@Override
	public String marshal(Attachments v) throws Exception {

		System.out.println("marschall:" + v);
		return "bla";
		// return v.getId();
	}
}