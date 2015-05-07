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
package es.eucm.mokap.backend.reporting.reports;

/**
 * Enum with the different event categories we are using for the events in our
 * reports.
 */
public enum EventCategories {
	EC_VOTE("vote"), EC_DOWNLOAD("download");

	private String value;

	private EventCategories(String val) {
		this.value = val;
	}

	public String getValue() {
		return this.value;
	}

}