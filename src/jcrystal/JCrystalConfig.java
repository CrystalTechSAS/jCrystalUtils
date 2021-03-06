/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal;

import jcrystal.configs.clients.ClientConfig;
import jcrystal.configs.server.ServerConfig;

public abstract class JCrystalConfig {
	public static String JCRYSTAL_SERVER_URL = "https://1-dot-back-dot-jcrystal-213302.appspot.com";

	public static ServerConfig SERVER = new ServerConfig();
	public static ClientConfig CLIENT = new ClientConfig();
}
