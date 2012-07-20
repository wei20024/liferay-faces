/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.bridge.tck.context;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Principal;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.faces.context.ExternalContext;

import com.liferay.faces.util.helper.Wrapper;


/**
 * @author  Neil Griffin
 */
public abstract class ExternalContextWrapper extends ExternalContext implements Wrapper<ExternalContext> {

	@Override
	public void dispatch(String path) throws IOException {
		getWrapped().dispatch(path);
	}

	@Override
	public String encodeActionURL(String url) {
		return getWrapped().encodeActionURL(url);
	}

	@Override
	public String encodeNamespace(String name) {
		return getWrapped().encodeNamespace(name);
	}

	@Override
	public String encodeResourceURL(String url) {
		return getWrapped().encodeResourceURL(url);
	}

	@Override
	public void log(String message) {
		getWrapped().log(message);
	}

	@Override
	public void log(String message, Throwable exception) {
		getWrapped().log(message, exception);
	}

	@Override
	public void redirect(String url) throws IOException {
		getWrapped().redirect(url);
	}

	@Override
	public Map<String, Object> getApplicationMap() {
		return getWrapped().getApplicationMap();
	}

	@Override
	public String getAuthType() {
		return getWrapped().getAuthType();
	}

	@Override
	public Object getContext() {
		return getWrapped().getContext();
	}

	@Override
	public boolean isUserInRole(String role) {
		return getWrapped().isUserInRole(role);
	}

	@Override
	public String getInitParameter(String name) {
		return getWrapped().getInitParameter(name);
	}

	@Override
	public Map<?, ?> getInitParameterMap() {
		return getWrapped().getInitParameterMap();
	}

	@Override
	public String getRemoteUser() {
		return getWrapped().getRemoteUser();
	}

	@Override
	public Object getRequest() {
		return getWrapped().getRequest();
	}

	@Override
	public void setRequest(Object request) {
		getWrapped().setRequest(request);
	}

	@Override
	public String getRequestCharacterEncoding() {
		return getWrapped().getRequestCharacterEncoding();
	}

	@Override
	public void setRequestCharacterEncoding(String encoding) throws UnsupportedEncodingException {
		getWrapped().setRequestCharacterEncoding(encoding);
	}

	@Override
	public String getRequestContentType() {
		return getWrapped().getRequestContentType();
	}

	@Override
	public String getRequestContextPath() {
		return getWrapped().getRequestContextPath();
	}

	@Override
	public Map<String, Object> getRequestCookieMap() {
		return getWrapped().getRequestCookieMap();
	}

	@Override
	public Map<String, String> getRequestHeaderMap() {
		return getWrapped().getRequestHeaderMap();
	}

	@Override
	public Map<String, String[]> getRequestHeaderValuesMap() {
		return getWrapped().getRequestHeaderValuesMap();
	}

	@Override
	public Locale getRequestLocale() {
		return getWrapped().getRequestLocale();
	}

	@Override
	public Iterator<Locale> getRequestLocales() {
		return getWrapped().getRequestLocales();
	}

	@Override
	public Map<String, Object> getRequestMap() {
		return getWrapped().getRequestMap();
	}

	@Override
	public Map<String, String> getRequestParameterMap() {
		return getWrapped().getRequestParameterMap();
	}

	@Override
	public Iterator<String> getRequestParameterNames() {
		return getWrapped().getRequestParameterNames();
	}

	@Override
	public Map<String, String[]> getRequestParameterValuesMap() {
		return getWrapped().getRequestParameterValuesMap();
	}

	@Override
	public String getRequestPathInfo() {
		return getWrapped().getRequestPathInfo();
	}

	@Override
	public String getRequestServletPath() {
		return getWrapped().getRequestServletPath();
	}

	@Override
	public URL getResource(String path) throws MalformedURLException {
		return getWrapped().getResource(path);
	}

	@Override
	public InputStream getResourceAsStream(String path) {
		return getWrapped().getResourceAsStream(path);
	}

	@Override
	public Set<String> getResourcePaths(String path) {
		return getWrapped().getResourcePaths(path);
	}

	@Override
	public Object getResponse() {
		return getWrapped().getResponse();
	}

	@Override
	public void setResponse(Object response) {
		getWrapped().setResponse(response);
	}

	@Override
	public String getResponseCharacterEncoding() {
		return getWrapped().getResponseCharacterEncoding();
	}

	@Override
	public void setResponseCharacterEncoding(String encoding) {
		getWrapped().setResponseCharacterEncoding(encoding);
	}

	@Override
	public String getResponseContentType() {
		return getWrapped().getResponseContentType();
	}

	@Override
	public Object getSession(boolean create) {
		return getWrapped().getSession(create);
	}

	@Override
	public Map<String, Object> getSessionMap() {
		return getWrapped().getSessionMap();
	}

	@Override
	public Principal getUserPrincipal() {
		return getWrapped().getUserPrincipal();
	}

	public abstract ExternalContext getWrapped();
}
