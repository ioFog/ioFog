/*
 * *******************************************************************************
 *  * Copyright (c) 2023 Datasance Teknoloji A.S.
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Eclipse Public License v. 2.0 which is available at
 *  * http://www.eclipse.org/legal/epl-2.0
 *  *
 *  * SPDX-License-Identifier: EPL-2.0
 *  *******************************************************************************
 *
 */

 package org.eclipse.iofog.microservice;

 /**
  * represents Microservices devices 
  * 
  * @author emirhandurmus
  *
  */

  public class Device {
    private String name;
    private String path;

    public Device(String name, String path) {
        this.name = name;
        this.path = path;
    }

    // Add getters and setters for the name and path fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Device{name='" + name + "', path='" + path + "'}";
    }
}