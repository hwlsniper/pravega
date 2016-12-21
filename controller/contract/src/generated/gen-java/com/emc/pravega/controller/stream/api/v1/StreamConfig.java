/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.emc.pravega.controller.stream.api.v1;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-20")
public class StreamConfig implements org.apache.thrift.TBase<StreamConfig, StreamConfig._Fields>, java.io.Serializable, Cloneable, Comparable<StreamConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StreamConfig");

  private static final org.apache.thrift.protocol.TField SCOPE_FIELD_DESC = new org.apache.thrift.protocol.TField("scope", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("policy", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField SEALED_FIELD_DESC = new org.apache.thrift.protocol.TField("sealed", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StreamConfigStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StreamConfigTupleSchemeFactory());
  }

  private String scope; // required
  private String name; // required
  private ScalingPolicy policy; // required
  private boolean sealed; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCOPE((short)1, "scope"),
    NAME((short)2, "name"),
    POLICY((short)3, "policy"),
    SEALED((short)4, "sealed");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SCOPE
          return SCOPE;
        case 2: // NAME
          return NAME;
        case 3: // POLICY
          return POLICY;
        case 4: // SEALED
          return SEALED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SEALED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCOPE, new org.apache.thrift.meta_data.FieldMetaData("scope", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POLICY, new org.apache.thrift.meta_data.FieldMetaData("policy", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ScalingPolicy.class)));
    tmpMap.put(_Fields.SEALED, new org.apache.thrift.meta_data.FieldMetaData("sealed", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StreamConfig.class, metaDataMap);
  }

  public StreamConfig() {
  }

  public StreamConfig(
    String scope,
    String name,
    ScalingPolicy policy,
    boolean sealed)
  {
    this();
    this.scope = scope;
    this.name = name;
    this.policy = policy;
    this.sealed = sealed;
    setSealedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StreamConfig(StreamConfig other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetScope()) {
      this.scope = other.scope;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetPolicy()) {
      this.policy = new ScalingPolicy(other.policy);
    }
    this.sealed = other.sealed;
  }

  public StreamConfig deepCopy() {
    return new StreamConfig(this);
  }

  @Override
  public void clear() {
    this.scope = null;
    this.name = null;
    this.policy = null;
    setSealedIsSet(false);
    this.sealed = false;
  }

  public String getScope() {
    return this.scope;
  }

  public StreamConfig setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public void unsetScope() {
    this.scope = null;
  }

  /** Returns true if field scope is set (has been assigned a value) and false otherwise */
  public boolean isSetScope() {
    return this.scope != null;
  }

  public void setScopeIsSet(boolean value) {
    if (!value) {
      this.scope = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public StreamConfig setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public ScalingPolicy getPolicy() {
    return this.policy;
  }

  public StreamConfig setPolicy(ScalingPolicy policy) {
    this.policy = policy;
    return this;
  }

  public void unsetPolicy() {
    this.policy = null;
  }

  /** Returns true if field policy is set (has been assigned a value) and false otherwise */
  public boolean isSetPolicy() {
    return this.policy != null;
  }

  public void setPolicyIsSet(boolean value) {
    if (!value) {
      this.policy = null;
    }
  }

  public boolean isSealed() {
    return this.sealed;
  }

  public StreamConfig setSealed(boolean sealed) {
    this.sealed = sealed;
    setSealedIsSet(true);
    return this;
  }

  public void unsetSealed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEALED_ISSET_ID);
  }

  /** Returns true if field sealed is set (has been assigned a value) and false otherwise */
  public boolean isSetSealed() {
    return EncodingUtils.testBit(__isset_bitfield, __SEALED_ISSET_ID);
  }

  public void setSealedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEALED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCOPE:
      if (value == null) {
        unsetScope();
      } else {
        setScope((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case POLICY:
      if (value == null) {
        unsetPolicy();
      } else {
        setPolicy((ScalingPolicy)value);
      }
      break;

    case SEALED:
      if (value == null) {
        unsetSealed();
      } else {
        setSealed((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCOPE:
      return getScope();

    case NAME:
      return getName();

    case POLICY:
      return getPolicy();

    case SEALED:
      return isSealed();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCOPE:
      return isSetScope();
    case NAME:
      return isSetName();
    case POLICY:
      return isSetPolicy();
    case SEALED:
      return isSetSealed();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StreamConfig)
      return this.equals((StreamConfig)that);
    return false;
  }

  public boolean equals(StreamConfig that) {
    if (that == null)
      return false;

    boolean this_present_scope = true && this.isSetScope();
    boolean that_present_scope = true && that.isSetScope();
    if (this_present_scope || that_present_scope) {
      if (!(this_present_scope && that_present_scope))
        return false;
      if (!this.scope.equals(that.scope))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_policy = true && this.isSetPolicy();
    boolean that_present_policy = true && that.isSetPolicy();
    if (this_present_policy || that_present_policy) {
      if (!(this_present_policy && that_present_policy))
        return false;
      if (!this.policy.equals(that.policy))
        return false;
    }

    boolean this_present_sealed = true;
    boolean that_present_sealed = true;
    if (this_present_sealed || that_present_sealed) {
      if (!(this_present_sealed && that_present_sealed))
        return false;
      if (this.sealed != that.sealed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_scope = true && (isSetScope());
    list.add(present_scope);
    if (present_scope)
      list.add(scope);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_policy = true && (isSetPolicy());
    list.add(present_policy);
    if (present_policy)
      list.add(policy);

    boolean present_sealed = true;
    list.add(present_sealed);
    if (present_sealed)
      list.add(sealed);

    return list.hashCode();
  }

  @Override
  public int compareTo(StreamConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetScope()).compareTo(other.isSetScope());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScope()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scope, other.scope);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPolicy()).compareTo(other.isSetPolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.policy, other.policy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSealed()).compareTo(other.isSetSealed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSealed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sealed, other.sealed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StreamConfig(");
    boolean first = true;

    sb.append("scope:");
    if (this.scope == null) {
      sb.append("null");
    } else {
      sb.append(this.scope);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("policy:");
    if (this.policy == null) {
      sb.append("null");
    } else {
      sb.append(this.policy);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sealed:");
    sb.append(this.sealed);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (scope == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'scope' was not present! Struct: " + toString());
    }
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (policy == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'policy' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'sealed' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (policy != null) {
      policy.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StreamConfigStandardSchemeFactory implements SchemeFactory {
    public StreamConfigStandardScheme getScheme() {
      return new StreamConfigStandardScheme();
    }
  }

  private static class StreamConfigStandardScheme extends StandardScheme<StreamConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StreamConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCOPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scope = iprot.readString();
              struct.setScopeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.policy = new ScalingPolicy();
              struct.policy.read(iprot);
              struct.setPolicyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SEALED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.sealed = iprot.readBool();
              struct.setSealedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSealed()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'sealed' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StreamConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.scope != null) {
        oprot.writeFieldBegin(SCOPE_FIELD_DESC);
        oprot.writeString(struct.scope);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.policy != null) {
        oprot.writeFieldBegin(POLICY_FIELD_DESC);
        struct.policy.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEALED_FIELD_DESC);
      oprot.writeBool(struct.sealed);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StreamConfigTupleSchemeFactory implements SchemeFactory {
    public StreamConfigTupleScheme getScheme() {
      return new StreamConfigTupleScheme();
    }
  }

  private static class StreamConfigTupleScheme extends TupleScheme<StreamConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StreamConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.scope);
      oprot.writeString(struct.name);
      struct.policy.write(oprot);
      oprot.writeBool(struct.sealed);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StreamConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.scope = iprot.readString();
      struct.setScopeIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.policy = new ScalingPolicy();
      struct.policy.read(iprot);
      struct.setPolicyIsSet(true);
      struct.sealed = iprot.readBool();
      struct.setSealedIsSet(true);
    }
  }

}

