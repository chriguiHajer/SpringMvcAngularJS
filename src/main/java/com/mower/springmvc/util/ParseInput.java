package com.mower.springmvc.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mower.springmvc.model.Coordinates;
import com.mower.springmvc.model.Mower;

public abstract class ParseInput {

	public List<Mower> getMowersFromInput(String url) throws Exception {

		if (url == null || url.isEmpty()) {

			throw new NullPointerException("invalid request params");
		}

		List<Mower> mowers = new ArrayList<>();

		BufferedReader inputBuffer = null;
		String line;
		int x = 0;

		try {

			inputBuffer = new BufferedReader(new FileReader(url));

			while ((line = inputBuffer.readLine()) != null) {

				if (x % 2 != 0) {

					Coordinates coordinates = new Coordinates();
					coordinates.setX(Integer.valueOf(line.substring(0, 1)));
					coordinates.setY(Integer.valueOf(line.substring(2, 3)));
					coordinates.setOrientation(line.substring(4, 5));
					mowers.add(new Mower(x, coordinates, inputBuffer.readLine()));
					x = x + 1;
				}
				x = x + 1;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputBuffer != null)
					inputBuffer.close();
			} catch (IOException inputException) {
				inputException.printStackTrace();
			}
		}

		return mowers;
	}

}
