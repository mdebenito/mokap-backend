/**
 *  Copyright [2014] [mokap.es]
 *
 *    This file is part of the mokap community backend (MCB).
 *    MCB is licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package es.eucm.mokap.backend.reporting.ga;

import es.eucm.mokap.backend.reporting.Reporting;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by reyde_000 on 09/03/2015.
 */
public class GoogleReporter implements Reporting {

	GoogleAnalyticsAPI gat;
	private static String TID = System.getProperty("backend.ANALYTICS_ID");

	public GoogleReporter() throws IOException {
		gat = new GoogleAnalyticsAPI(TID);
		gat.setGoogleAnalyticsClientId(UUID.randomUUID().toString());
	}

	@Override
	public void reportDownload(String fileName) throws IOException {
		gat.trackEventToGoogleAnalytics("download", fileName, "", "1",
				System.getProperty("backend.BASE_URL"));
	}
}