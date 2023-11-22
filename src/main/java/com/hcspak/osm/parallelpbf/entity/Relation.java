/*
 * This file is part of parallelpbf.
 *
 *     parallelpbf is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Foobar is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.hcspak.osm.parallelpbf.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * OSM Relation entity.
 * <p>
 * Groups several OSM entities (including other relations)
 * to the single logical entity.
 *
 * @see RelationMember
 */
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class Relation extends OsmEntity {
  /**
   * Entity constructor.
   *
   * @param id Sets required object id during construction.
   */
  public Relation(long id, Info info, Map<String, String> tags) {
    super(id, tags, info);
  }

  /**
   * Ordered list of relation members. Can be empty.
   */
  private final List<RelationMember> members = new LinkedList<>();
}
