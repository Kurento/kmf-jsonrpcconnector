/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package com.kurento.kmf.jsonrpcconnector;

import java.io.IOException;

/**
 * A transaction represents a conversation between a client and the server.
 * 
 * @author Ivan Gracia (igracia@gsyc.es) since 1.0.0
 * 
 */
public interface Transaction {

	void sendResponse(Object result) throws IOException;

	void sendError(int code, String message, String data) throws IOException;

	void sendError(Exception e) throws IOException;

	Session getSession();

	void startAsync();

	boolean isNotification();

}
