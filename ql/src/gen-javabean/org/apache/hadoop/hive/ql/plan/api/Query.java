/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.ql.plan.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.log4j.Logger;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class Query implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Query");
  private static final TField QUERY_ID_FIELD_DESC = new TField("queryId", TType.STRING, (short)1);
  private static final TField QUERY_TYPE_FIELD_DESC = new TField("queryType", TType.STRING, (short)2);
  private static final TField QUERY_ATTRIBUTES_FIELD_DESC = new TField("queryAttributes", TType.MAP, (short)3);
  private static final TField QUERY_COUNTERS_FIELD_DESC = new TField("queryCounters", TType.MAP, (short)4);
  private static final TField STAGE_GRAPH_FIELD_DESC = new TField("stageGraph", TType.STRUCT, (short)5);
  private static final TField STAGE_LIST_FIELD_DESC = new TField("stageList", TType.LIST, (short)6);
  private static final TField DONE_FIELD_DESC = new TField("done", TType.BOOL, (short)7);
  private static final TField STARTED_FIELD_DESC = new TField("started", TType.BOOL, (short)8);

  private String queryId;
  public static final int QUERYID = 1;
  private String queryType;
  public static final int QUERYTYPE = 2;
  private Map<String,String> queryAttributes;
  public static final int QUERYATTRIBUTES = 3;
  private Map<String,Long> queryCounters;
  public static final int QUERYCOUNTERS = 4;
  private Graph stageGraph;
  public static final int STAGEGRAPH = 5;
  private List<Stage> stageList;
  public static final int STAGELIST = 6;
  private boolean done;
  public static final int DONE = 7;
  private boolean started;
  public static final int STARTED = 8;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean done = false;
    public boolean started = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(QUERYID, new FieldMetaData("queryId", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(QUERYTYPE, new FieldMetaData("queryType", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(QUERYATTRIBUTES, new FieldMetaData("queryAttributes", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.STRING))));
    put(QUERYCOUNTERS, new FieldMetaData("queryCounters", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.I64))));
    put(STAGEGRAPH, new FieldMetaData("stageGraph", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Graph.class)));
    put(STAGELIST, new FieldMetaData("stageList", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Stage.class))));
    put(DONE, new FieldMetaData("done", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    put(STARTED, new FieldMetaData("started", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Query.class, metaDataMap);
  }

  public Query() {
  }

  public Query(
    String queryId,
    String queryType,
    Map<String,String> queryAttributes,
    Map<String,Long> queryCounters,
    Graph stageGraph,
    List<Stage> stageList,
    boolean done,
    boolean started)
  {
    this();
    this.queryId = queryId;
    this.queryType = queryType;
    this.queryAttributes = queryAttributes;
    this.queryCounters = queryCounters;
    this.stageGraph = stageGraph;
    this.stageList = stageList;
    this.done = done;
    this.__isset.done = true;
    this.started = started;
    this.__isset.started = true;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Query(Query other) {
    if (other.isSetQueryId()) {
      this.queryId = other.queryId;
    }
    if (other.isSetQueryType()) {
      this.queryType = other.queryType;
    }
    if (other.isSetQueryAttributes()) {
      Map<String,String> __this__queryAttributes = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.queryAttributes.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__queryAttributes_copy_key = other_element_key;

        String __this__queryAttributes_copy_value = other_element_value;

        __this__queryAttributes.put(__this__queryAttributes_copy_key, __this__queryAttributes_copy_value);
      }
      this.queryAttributes = __this__queryAttributes;
    }
    if (other.isSetQueryCounters()) {
      Map<String,Long> __this__queryCounters = new HashMap<String,Long>();
      for (Map.Entry<String, Long> other_element : other.queryCounters.entrySet()) {

        String other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        String __this__queryCounters_copy_key = other_element_key;

        Long __this__queryCounters_copy_value = other_element_value;

        __this__queryCounters.put(__this__queryCounters_copy_key, __this__queryCounters_copy_value);
      }
      this.queryCounters = __this__queryCounters;
    }
    if (other.isSetStageGraph()) {
      this.stageGraph = new Graph(other.stageGraph);
    }
    if (other.isSetStageList()) {
      List<Stage> __this__stageList = new ArrayList<Stage>();
      for (Stage other_element : other.stageList) {
        __this__stageList.add(new Stage(other_element));
      }
      this.stageList = __this__stageList;
    }
    __isset.done = other.__isset.done;
    this.done = other.done;
    __isset.started = other.__isset.started;
    this.started = other.started;
  }

  @Override
  public Query clone() {
    return new Query(this);
  }

  public String getQueryId() {
    return this.queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public void unsetQueryId() {
    this.queryId = null;
  }

  // Returns true if field queryId is set (has been asigned a value) and false otherwise
  public boolean isSetQueryId() {
    return this.queryId != null;
  }

  public String getQueryType() {
    return this.queryType;
  }

  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }

  public void unsetQueryType() {
    this.queryType = null;
  }

  // Returns true if field queryType is set (has been asigned a value) and false otherwise
  public boolean isSetQueryType() {
    return this.queryType != null;
  }

  public int getQueryAttributesSize() {
    return (this.queryAttributes == null) ? 0 : this.queryAttributes.size();
  }

  public void putToQueryAttributes(String key, String val) {
    if (this.queryAttributes == null) {
      this.queryAttributes = new HashMap<String,String>();
    }
    this.queryAttributes.put(key, val);
  }

  public Map<String,String> getQueryAttributes() {
    return this.queryAttributes;
  }

  public void setQueryAttributes(Map<String,String> queryAttributes) {
    this.queryAttributes = queryAttributes;
  }

  public void unsetQueryAttributes() {
    this.queryAttributes = null;
  }

  // Returns true if field queryAttributes is set (has been asigned a value) and false otherwise
  public boolean isSetQueryAttributes() {
    return this.queryAttributes != null;
  }

  public int getQueryCountersSize() {
    return (this.queryCounters == null) ? 0 : this.queryCounters.size();
  }

  public void putToQueryCounters(String key, long val) {
    if (this.queryCounters == null) {
      this.queryCounters = new HashMap<String,Long>();
    }
    this.queryCounters.put(key, val);
  }

  public Map<String,Long> getQueryCounters() {
    return this.queryCounters;
  }

  public void setQueryCounters(Map<String,Long> queryCounters) {
    this.queryCounters = queryCounters;
  }

  public void unsetQueryCounters() {
    this.queryCounters = null;
  }

  // Returns true if field queryCounters is set (has been asigned a value) and false otherwise
  public boolean isSetQueryCounters() {
    return this.queryCounters != null;
  }

  public Graph getStageGraph() {
    return this.stageGraph;
  }

  public void setStageGraph(Graph stageGraph) {
    this.stageGraph = stageGraph;
  }

  public void unsetStageGraph() {
    this.stageGraph = null;
  }

  // Returns true if field stageGraph is set (has been asigned a value) and false otherwise
  public boolean isSetStageGraph() {
    return this.stageGraph != null;
  }

  public int getStageListSize() {
    return (this.stageList == null) ? 0 : this.stageList.size();
  }

  public java.util.Iterator<Stage> getStageListIterator() {
    return (this.stageList == null) ? null : this.stageList.iterator();
  }

  public void addToStageList(Stage elem) {
    if (this.stageList == null) {
      this.stageList = new ArrayList<Stage>();
    }
    this.stageList.add(elem);
  }

  public List<Stage> getStageList() {
    return this.stageList;
  }

  public void setStageList(List<Stage> stageList) {
    this.stageList = stageList;
  }

  public void unsetStageList() {
    this.stageList = null;
  }

  // Returns true if field stageList is set (has been asigned a value) and false otherwise
  public boolean isSetStageList() {
    return this.stageList != null;
  }

  public boolean isDone() {
    return this.done;
  }

  public void setDone(boolean done) {
    this.done = done;
    this.__isset.done = true;
  }

  public void unsetDone() {
    this.__isset.done = false;
  }

  // Returns true if field done is set (has been asigned a value) and false otherwise
  public boolean isSetDone() {
    return this.__isset.done;
  }

  public boolean isStarted() {
    return this.started;
  }

  public void setStarted(boolean started) {
    this.started = started;
    this.__isset.started = true;
  }

  public void unsetStarted() {
    this.__isset.started = false;
  }

  // Returns true if field started is set (has been asigned a value) and false otherwise
  public boolean isSetStarted() {
    return this.__isset.started;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case QUERYID:
      if (value == null) {
        unsetQueryId();
      } else {
        setQueryId((String)value);
      }
      break;

    case QUERYTYPE:
      if (value == null) {
        unsetQueryType();
      } else {
        setQueryType((String)value);
      }
      break;

    case QUERYATTRIBUTES:
      if (value == null) {
        unsetQueryAttributes();
      } else {
        setQueryAttributes((Map<String,String>)value);
      }
      break;

    case QUERYCOUNTERS:
      if (value == null) {
        unsetQueryCounters();
      } else {
        setQueryCounters((Map<String,Long>)value);
      }
      break;

    case STAGEGRAPH:
      if (value == null) {
        unsetStageGraph();
      } else {
        setStageGraph((Graph)value);
      }
      break;

    case STAGELIST:
      if (value == null) {
        unsetStageList();
      } else {
        setStageList((List<Stage>)value);
      }
      break;

    case DONE:
      if (value == null) {
        unsetDone();
      } else {
        setDone((Boolean)value);
      }
      break;

    case STARTED:
      if (value == null) {
        unsetStarted();
      } else {
        setStarted((Boolean)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case QUERYID:
      return getQueryId();

    case QUERYTYPE:
      return getQueryType();

    case QUERYATTRIBUTES:
      return getQueryAttributes();

    case QUERYCOUNTERS:
      return getQueryCounters();

    case STAGEGRAPH:
      return getStageGraph();

    case STAGELIST:
      return getStageList();

    case DONE:
      return new Boolean(isDone());

    case STARTED:
      return new Boolean(isStarted());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case QUERYID:
      return isSetQueryId();
    case QUERYTYPE:
      return isSetQueryType();
    case QUERYATTRIBUTES:
      return isSetQueryAttributes();
    case QUERYCOUNTERS:
      return isSetQueryCounters();
    case STAGEGRAPH:
      return isSetStageGraph();
    case STAGELIST:
      return isSetStageList();
    case DONE:
      return isSetDone();
    case STARTED:
      return isSetStarted();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Query)
      return this.equals((Query)that);
    return false;
  }

  public boolean equals(Query that) {
    if (that == null)
      return false;

    boolean this_present_queryId = true && this.isSetQueryId();
    boolean that_present_queryId = true && that.isSetQueryId();
    if (this_present_queryId || that_present_queryId) {
      if (!(this_present_queryId && that_present_queryId))
        return false;
      if (!this.queryId.equals(that.queryId))
        return false;
    }

    boolean this_present_queryType = true && this.isSetQueryType();
    boolean that_present_queryType = true && that.isSetQueryType();
    if (this_present_queryType || that_present_queryType) {
      if (!(this_present_queryType && that_present_queryType))
        return false;
      if (!this.queryType.equals(that.queryType))
        return false;
    }

    boolean this_present_queryAttributes = true && this.isSetQueryAttributes();
    boolean that_present_queryAttributes = true && that.isSetQueryAttributes();
    if (this_present_queryAttributes || that_present_queryAttributes) {
      if (!(this_present_queryAttributes && that_present_queryAttributes))
        return false;
      if (!this.queryAttributes.equals(that.queryAttributes))
        return false;
    }

    boolean this_present_queryCounters = true && this.isSetQueryCounters();
    boolean that_present_queryCounters = true && that.isSetQueryCounters();
    if (this_present_queryCounters || that_present_queryCounters) {
      if (!(this_present_queryCounters && that_present_queryCounters))
        return false;
      if (!this.queryCounters.equals(that.queryCounters))
        return false;
    }

    boolean this_present_stageGraph = true && this.isSetStageGraph();
    boolean that_present_stageGraph = true && that.isSetStageGraph();
    if (this_present_stageGraph || that_present_stageGraph) {
      if (!(this_present_stageGraph && that_present_stageGraph))
        return false;
      if (!this.stageGraph.equals(that.stageGraph))
        return false;
    }

    boolean this_present_stageList = true && this.isSetStageList();
    boolean that_present_stageList = true && that.isSetStageList();
    if (this_present_stageList || that_present_stageList) {
      if (!(this_present_stageList && that_present_stageList))
        return false;
      if (!this.stageList.equals(that.stageList))
        return false;
    }

    boolean this_present_done = true;
    boolean that_present_done = true;
    if (this_present_done || that_present_done) {
      if (!(this_present_done && that_present_done))
        return false;
      if (this.done != that.done)
        return false;
    }

    boolean this_present_started = true;
    boolean that_present_started = true;
    if (this_present_started || that_present_started) {
      if (!(this_present_started && that_present_started))
        return false;
      if (this.started != that.started)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case QUERYID:
          if (field.type == TType.STRING) {
            this.queryId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case QUERYTYPE:
          if (field.type == TType.STRING) {
            this.queryType = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case QUERYATTRIBUTES:
          if (field.type == TType.MAP) {
            {
              TMap _map50 = iprot.readMapBegin();
              this.queryAttributes = new HashMap<String,String>(2*_map50.size);
              for (int _i51 = 0; _i51 < _map50.size; ++_i51)
              {
                String _key52;
                String _val53;
                _key52 = iprot.readString();
                _val53 = iprot.readString();
                this.queryAttributes.put(_key52, _val53);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case QUERYCOUNTERS:
          if (field.type == TType.MAP) {
            {
              TMap _map54 = iprot.readMapBegin();
              this.queryCounters = new HashMap<String,Long>(2*_map54.size);
              for (int _i55 = 0; _i55 < _map54.size; ++_i55)
              {
                String _key56;
                long _val57;
                _key56 = iprot.readString();
                _val57 = iprot.readI64();
                this.queryCounters.put(_key56, _val57);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STAGEGRAPH:
          if (field.type == TType.STRUCT) {
            this.stageGraph = new Graph();
            this.stageGraph.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STAGELIST:
          if (field.type == TType.LIST) {
            {
              TList _list58 = iprot.readListBegin();
              this.stageList = new ArrayList<Stage>(_list58.size);
              for (int _i59 = 0; _i59 < _list58.size; ++_i59)
              {
                Stage _elem60;
                _elem60 = new Stage();
                _elem60.read(iprot);
                this.stageList.add(_elem60);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DONE:
          if (field.type == TType.BOOL) {
            this.done = iprot.readBool();
            this.__isset.done = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STARTED:
          if (field.type == TType.BOOL) {
            this.started = iprot.readBool();
            this.__isset.started = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.queryId != null) {
      oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
      oprot.writeString(this.queryId);
      oprot.writeFieldEnd();
    }
    if (this.queryType != null) {
      oprot.writeFieldBegin(QUERY_TYPE_FIELD_DESC);
      oprot.writeString(this.queryType);
      oprot.writeFieldEnd();
    }
    if (this.queryAttributes != null) {
      oprot.writeFieldBegin(QUERY_ATTRIBUTES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.queryAttributes.size()));
        for (Map.Entry<String, String> _iter61 : this.queryAttributes.entrySet())        {
          oprot.writeString(_iter61.getKey());
          oprot.writeString(_iter61.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.queryCounters != null) {
      oprot.writeFieldBegin(QUERY_COUNTERS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.I64, this.queryCounters.size()));
        for (Map.Entry<String, Long> _iter62 : this.queryCounters.entrySet())        {
          oprot.writeString(_iter62.getKey());
          oprot.writeI64(_iter62.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.stageGraph != null) {
      oprot.writeFieldBegin(STAGE_GRAPH_FIELD_DESC);
      this.stageGraph.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.stageList != null) {
      oprot.writeFieldBegin(STAGE_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.stageList.size()));
        for (Stage _iter63 : this.stageList)        {
          _iter63.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(DONE_FIELD_DESC);
    oprot.writeBool(this.done);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(STARTED_FIELD_DESC);
    oprot.writeBool(this.started);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Query(");
    boolean first = true;

    sb.append("queryId:");
    if (this.queryId == null) {
      sb.append("null");
    } else {
      sb.append(this.queryId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryType:");
    if (this.queryType == null) {
      sb.append("null");
    } else {
      sb.append(this.queryType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryAttributes:");
    if (this.queryAttributes == null) {
      sb.append("null");
    } else {
      sb.append(this.queryAttributes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryCounters:");
    if (this.queryCounters == null) {
      sb.append("null");
    } else {
      sb.append(this.queryCounters);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stageGraph:");
    if (this.stageGraph == null) {
      sb.append("null");
    } else {
      sb.append(this.stageGraph);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stageList:");
    if (this.stageList == null) {
      sb.append("null");
    } else {
      sb.append(this.stageList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("done:");
    sb.append(this.done);
    first = false;
    if (!first) sb.append(", ");
    sb.append("started:");
    sb.append(this.started);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
